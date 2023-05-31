# import requests

# API_KEY = '8c49b1672791011431b00c6c4b458138'  # Replace with your own API key
# URL = 'http://api.openweathermap.org/data/2.5/weather'

# def get_weather(city):
#     params = {
#         'q': city,
#         'appid': API_KEY,
#         'units': 'metric'
#     }
#     response = requests.get(URL, params=params)
#     data = response.json()
#     if data['cod'] == 200:
#         weather = {
#             'description': data['weather'][0]['description'],
#             'temperature': data['main']['temp'],
#             'humidity': data['main']['humidity'],
#             'wind_speed': data['wind']['speed']
#         }
#         return weather
#     else:
#         print('Error:', data['message'])
#         return None

# weather = get_weather('London')
# print(weather)


print("HEllo")
