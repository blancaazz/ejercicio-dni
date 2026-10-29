import com.example.DniUtils;

public class Main {
    
    public static void main(String[] args){
        
        System.out.println("Calcular Letra: ");
        
        int[] numeros = {12345678, 0, 99999999, 45687988};
        for (int n : numeros) {
            System.out.println(n + " -> " + DniUtils.calcularLetra(n));
        }

        System.out.println("\nValidar Dni: ");
        String[] dnis = {"12345678Z", "12345678A", "12345678z", " 12345678Z ", "1234567Z", "ABCDEFGHZ", "", null};
        for (String dni : dnis) {
            System.out.println("\"" + dni + "\" -> " + DniUtils.validarDni(dni));
        }

    }
}
