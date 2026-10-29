import requests

response = requests.post('http://127.0.0.1:8000/dni/12345678')
print("Respuesta: ", response.text)

response = requests.get('http://127.0.0.1:8000/dni/validar', params={"dni": "12345678Z"})
print("Respuesta: ", response.text)