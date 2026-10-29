# API Python - Microservicio DNI

## Descripción

Microservicio REST hecho con FastAPI que calcula la letra del DNI español y comprueba si un DNI es válido.

## Requisitos

- Tener Python instalado.
- Instalar las dependencias con `pip install -r requirements.txt`.

## Endpoints

- `POST /dni/{numero}`: devuelve la letra correspondiente al número del DNI.
- `GET /dni/validar?dni=...`: devuelve `true` si el DNI es correcto y `false` si no lo es.

## Ejemplo de uso

```powershell
curl.exe -X 'POST' 'http://127.0.0.1:8000/dni/12345678'
# "Z"

curl.exe -X 'GET' 'http://127.0.0.1:8000/dni/validar?dni=12345678L'
# false
```

## Ejecución

Desde la carpeta `microservicio_python`:

```powershell
pip install -r requirements.txt
python -m uvicorn app.main:app --reload
```

El servicio queda en `http://127.0.0.1:8000`. Para probar el cliente, con el servicio arrancado:

```powershell
python client/client.py
```

## Documentación

Con el servicio arrancado, la documentación está en `http://127.0.0.1:8000/docs`.