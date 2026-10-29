package com.example;

/**
 * Esta clase es una utilidad para calcular la letra del DNI español y para validar que sea un DNI correcto. 
 * Se trata de una pieza reutilizable elaborada para la asignatura Desarrollo del Software
 * <p>
 * La letra de un DNI se obtiene calculando el resto de dividir el número
 * (8 dígitos) entre 23 y usando ese resto como índice en la cadena
 * {@code TRWAGMYFPDXBNJZSQVHLCKE}.
 * </p>
 * 
 * <pre>{@code
 * char letra = DniUtils.calcularLetra(12345678); // 'Z'
 * boolean ok = DniUtils.validarDni("12345678Z"); // true
 * }</pre>
 */

public class DniUtils {

    /** Tabla oficial de letras, indexada por (número mod 23). */
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    /** Evita la instanciación de la clase. */
    private DniUtils(){

    }

    /**
     * Calcula la letra de control correspondiente a un número de DNI.
     *
     * @param numero número del DNI, entre 0 y 99 999 999 (ambos incluidos)
     * @return la letra de control en mayúscula
     * @throws IllegalArgumentException si {@code numero} está fuera del rango válido
     */
    public static char calcularLetra(int numero) {
        if (numero < 0 || numero > 99_999_999) {
            throw new IllegalArgumentException("El número de DNI debe tener entre 0 y 8 dígitos: " + numero);
        }
        return LETRAS.charAt(numero % 23);
    }

    /**
     * Valida un DNI completo (8 dígitos seguidos de una letra).
     * <p>
     * Se ignoran los espacios al principio y al final, y no se distingue
     * entre mayúsculas y minúsculas. No lanza excepciones: cualquier entrada
     * mal formada simplemente devuelve {@code false}.
     * </p>
     *
     * @param dni cadena con el DNI, por ejemplo {@code "12345678Z"}; puede ser {@code null}
     * @return {@code true} si el formato es correcto y la letra coincide con la calculada;
     *         {@code false} en caso contrario
     */
    public static boolean validarDni(String dni) {
        if (dni == null) {
            return false;
        }
        String limpio = dni.trim().toUpperCase();
        if (!limpio.matches("\\d{8}[A-Z]")) {
            return false;
        }
        int numero = Integer.parseInt(limpio.substring(0, 8));
        return calcularLetra(numero) == limpio.charAt(8);
    }
}
