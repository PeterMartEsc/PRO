package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */

import java.util.Scanner;

/**
 * Calcular el minimo común múltiplo de dos numeros dados
 */
import java.util.Scanner;

public class Ejercicio2 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese el primer número: ");
            int numero1 = sc.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numero2 = sc.nextInt();


            int a = numero1;                // Utilizamos el método para calcular el MCD mediante el algoritmo de Euclides (tuve que buscar mucho y bien que era este algoritmo antes de usarlo)
            int b = numero2;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int mcd = a;

            System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es " + mcd);
        }
    }


