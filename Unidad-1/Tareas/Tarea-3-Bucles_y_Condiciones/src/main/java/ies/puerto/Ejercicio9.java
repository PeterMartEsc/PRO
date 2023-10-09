package ies.puerto;

/**
 * @author PeterMartEsc
 * Entrega tarea 3
 */

/**
 * Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for.
 * Solicita el valor de la tabla por teclado
 */

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroTabla;

        System.out.print("Ingrese un número para saber su tabla de multiplicar: ");  // Solicitar al usuario el número para la tabla
        numeroTabla = scanner.nextInt();


        System.out.println("Tabla de multiplicar del " + numeroTabla + ":");     // Imprimir la tabla de multiplicar del número ingresado

        for (int i = 1; i <= 10; i++) {                                         //Bucle sencillito que imprime cada numero multiplicado por el valor introducido y su resultado

            int resultado = numeroTabla * i;
            System.out.println (numeroTabla + " x " + i + " = " + resultado);

        }
    }
}
