package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */


/**
 * 1. Escribe un programa en Java que imprima el patrón siguiente:
 *
 * 1
 *
 * 2 3
 *
 * 4 5 6
 *
 * 7 8 9 10
 */

public class Ejercicio1 {

        public static void main(String[] args) {
            int n = 1;
            int filas = 4; // Cambia este valor si deseas un número diferente de filas.

            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(n + " ");
                    n++;
                }
                System.out.println();
            }
        }
    }


