/*
 * Lenguajes de programación I
 * Facultad de Ingeniería
 * Universidad Autónoma de Campeche
 */
package numaletras;

import java.util.Scanner;

/**
 *
 * @author danieljaimes
 */
public class NumALetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        int num = 0;
        int decena = 0;
        int unidad = 0;

        String conector = "";
        String letras = "";

        // El índice cero a vacío para los números 0-9
        String decenas[] = {"", "dieci", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String unidades[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

        // Leer cantidad
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad = ");
        num = teclado.nextInt();
        
        if (num < 0 || num > 99) {              // Validar rango
            letras = "Número inválido";
        } else if (num >= 11 && num <= 15) {    // Casos especiales
            switch (num) {
                case 11:
                    letras = "once";
                    break;
                case 12:
                    letras = "doce";
                    break;
                case 13:
                    letras = "trece";
                    break;
                case 14:
                    letras = "catorce";
                    break;
                case 15:
                    letras = "quince";
                    break;
            }
        } else {                                // Casos generales
            decena = num / 10;
            unidad = num % 10;
            conector = (decena <= 2) ? "" : " y ";      // Casos dieci y veinti
            letras = decenas[decena] + conector + unidades[unidad];
        }
        System.out.println("Son: " + letras + " pesos.");
    }
}
