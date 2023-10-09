package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */


/**
 * Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.
 */

import java.util.Scanner;

public class Ejercicio3 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la posición para encontrar el número de Fibonacci: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("El valor de la posición debe ser un número pisitivo.");
            } else {
                int numFib1 = 0;
                int numFib2 = 1;
                int resultado = 0;

                if (n == 0) {
                    resultado = numFib1;

                } else if (n == 1) {
                    resultado = numFib2;

                } else {
                    for (int i = 2; i <= n; i++) {
                        resultado = numFib1 + numFib2;
                        numFib1 = numFib2;
                        numFib2 = resultado;
                    }
                }

                System.out.println("El número de Fibonacci en la posición " + n + " es: " + resultado);
            }

            scanner.close();
        }
    }

