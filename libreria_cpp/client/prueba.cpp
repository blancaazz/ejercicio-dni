#include "dni_utils.h"
#include <iostream>

int main(int argc, char* argv[]) {
    int num_prueba = 77689559;
    char letra_calculada = DniUtils::calcular_letra(num_prueba);
    std::cout << "Dni calculado: " << num_prueba << letra_calculada << std::endl;

    char* str;
    std::cout << "Introduce un DNI: ";
    std::cin >> str;
    
    if(DniUtils::validar_dni(str)) {
        std::cout << "Letra correcta" << std::endl;
    }
    else {
        std::cout << "Letra incorrecta" << std::endl;
    }
    
    return 0;
}