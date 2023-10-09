package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */

/**
 * Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.
 */
import java.util.Scanner;

public class Ejercicio5 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el numero de valores de fibonacci que desea ver: ");
            int valores = scanner.nextInt();

            if (valores <= 0) {
                System.out.println("EL numero de valores debe ser positivo");

            } else {
                System.out.println("Los primeros " + valores + " términos de la secuencia de Fibonacci son:");
                int a = 0;
                int b = 1;

                for (int i = 0; i < valores; i++) {

                    System.out.print(a + " ");
                    int temp = a;
                    a = b;
                    b = temp + b;
                }
            }
        }
    }

