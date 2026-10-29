
/**
 * @brief API que agrupa varias funciones estáticas para operar con números del DNI (Documento Nacional de Identidad) español
 */
class DniUtils {
public:
    /**
     * @brief Calcula la letra de validación a partir del número del DNI
     * 
     * @param numero Entero con el número del DNI
     * @return char Carácter con la letra de validación
     */
    static char calcular_letra(int numero);

    /**
     * @brief Comprueba si un número del DNI con letra es válido
     * 
     * @param dni Cadena de caracteres con el DNI
     * @pre dni tiene números en todas las posiciones salvo la última, donde tiene una letra
     * @return true Si el DNI es válido
     * @return false Si el DNI no es válido
     */
    static bool validar_dni(const char* dni);
};