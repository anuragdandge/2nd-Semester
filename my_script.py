from flask import Flask, render_template, request
import requests

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/weather', methods=['POST'])
def weather():
    city = request.form['city']
    API_KEY = '8c49b1672791011431b00c6c4b458138'  # Replace with your own API key
    URL = 'http://api.openweathermap.org/data/2.5/weather'
    params = {
        'q': city,
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
        return render_template('weather.html', city=city, weather=weather)
    else:
        error_msg = data['message']
        return render_template('error.html', city=city, error_msg=error_msg)

if __name__ == '__main__':
    app.run(debug=True)
