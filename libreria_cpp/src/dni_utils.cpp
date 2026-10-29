#include "dni_utils.h"
#include <string>

const char* listado_letras = "TRWAGMYFPDXBNJZSQVHLCKE";

char DniUtils::calcular_letra(int numero)
{
    int mod = numero % 23;
    return listado_letras[mod];
}

bool DniUtils::validar_dni(const char *dni)
{
    std::string str(dni);
    int num = std::stoi(str.substr(0, str.length() - 1));
    int mod = num % 23;
    return listado_letras[mod] == dni[str.length() - 1];
}
