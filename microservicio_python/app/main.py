from fastapi import FastAPI
from app.dni_utils import DniUtils

app = FastAPI(
    title='Microservicio DNI',
    description='API para resolver operaciones básicas con DNIs (Documentos Nacionales de Identidad) españoles.',
    version="1.0.0"
)

@app.post('/dni/{numero}')
def calcula_letra(numero: int):
    return DniUtils.calcular_letra(numero=numero)

@app.get('/dni/validar')
def valida_DNI_completo(dni: str):
    return DniUtils.validar_dni(dni=dni)