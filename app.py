from flask import Flask, request, jsonify
import requests

app = Flask(__name__)

API_KEY = '8c49b1672791011431b00c6c4b458138'  # Replace with your own API key
URL = 'http://api.openweathermap.org/data/2.5/weather'

@app.route('/weather', methods=['GET'])
def weather():
    country = request.args.get('country')
    params = {
        'q': country,
        'appid': API_KEY,
        'units': 'metric'
    }
    response = requests.get(URL, params=params)
    data = response.json()
    if data['cod'] == 200:
        weather = {
            'description': data['weather'][0]['description'],
            'temperature': data['main']['temp'],
            'humidity': data['main']['humidity'],
            'wind_speed': data['wind']['speed']
        }
        return jsonify(weather)
    else:
        return jsonify({'message': data['message']}), data['cod']

if __name__ == '__main__':
    app.run()
