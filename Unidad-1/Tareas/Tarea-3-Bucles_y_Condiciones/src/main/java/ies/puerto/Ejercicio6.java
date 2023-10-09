package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */

/**
 * Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000
 */

public class Ejercicio6 {

    public static void main(String[] args) {
        for (int numero = 1; numero <= 1000; numero++) {
            int num = numero;
            int suma = 0;
            int numDigitos = (int) Math.log10(numero) + 1;

            while (num > 0) {
                int digito = num % 10;
                suma += Math.pow(digito, numDigitos);
                num /= 10;
            }

            if (suma == numero) {
                System.out.print(numero + " ");
            }
        }
    }
}
