package ies.puerto;

import java.util.Scanner;

/**
 * Clase que realiza el Ej1 de las tareas
 */
public class Main {
    public static void main(String[] args) {

        int valorA;
        int valorB;

        Scanner lectura = new Scanner (System.in);

        //Bloque 1: Pide por pantalla y asigna valor

        //Bloque 2: Verifica si los valores son iguales
        do {
            System.out.println("Ingrese el valor de la Variable A: ");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A = "+valorA);

            System.out.println("Ingrese el valor de la Variable B: ");
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B = "+valorB);

        } while (valorA == valorB);

        //Bloque 3 Verifica si A>B
        if(valorA > valorB) {
            System.out.println("El valor de A es mayor");
        } else {
            System.out.println("El valor de B es mayor");
        }

        //Muestra por pantalla el valor mayor
    }
}