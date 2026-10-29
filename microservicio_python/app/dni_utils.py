CADENA_LETRAS_DNI = 'TRWAGMYFPDXBNJZSQVHLCKE'

class DniUtils:
    @staticmethod
    def calcular_letra(numero: int) -> chr:
        mod = numero % 23
        return CADENA_LETRAS_DNI[mod]

    @staticmethod
    def validar_dni(dni: str) -> bool:
        num = int(dni[0:-1])
        mod = num % 23
        return CADENA_LETRAS_DNI[mod] == dni[-1]