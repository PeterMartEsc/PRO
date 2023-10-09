package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */


import java.util.Scanner;

/**
 * Escribe un programa en Java que verifique si un número es palíndromo
 * Se debe solicitar el número por teclado.
 */

public class Ejercicio4 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduzca el número: ");
            int numero = scanner.nextInt();

            int numeroOriginal = numero;            //Declaramos las variables a utilizar
            int numeroInvertido = 0;

            while (numero > 0) {

                int valorAñadir = numero % 10;              //Iniciamos el bucle con la formula que vamos a utilizar

                numeroInvertido = numeroInvertido * 10 + valorAñadir;

                numero /= 10;
            }

            if (numeroOriginal == numeroInvertido) {            //Iniciamos un condicional el cual nos da los dos tipos de resultados

                System.out.println(numeroOriginal + " es un número palíndromo.");

            } else {
                System.out.println(numeroOriginal + " no es un número palíndromo.");
            }
        }
    }
