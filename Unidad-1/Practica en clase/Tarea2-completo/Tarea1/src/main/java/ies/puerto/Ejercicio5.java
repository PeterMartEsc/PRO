package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita leer dos
 * numeros y ordenarlos de menor a mayor, si es el caso.
 */
public class Ejercicio5 {
    public static void main(String[] args){
        int valorA;
        int valorB;

        Scanner lectura = new Scanner (System.in);


        //Bloque 2: verifica si los valores son iguales

        do {
            //Bloque 1: Pide por pantalla valor y asigna valor
            System.out.println("Ingrese el valor de la variable A: ");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A:"+valorA);

            System.out.println("Ingrese el valor de la variable B: ");
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B:"+valorB);
            if (valorA == valorB) {
                System.out.println("Los valores son iguales");
            }
        }while (valorA == valorB);

        //Bloque 3: verifica si A > B
        if (valorA > valorB) {
            System.out.printf("El valor de A es mayor");
        } else {
            System.out.printf("El valor de B es mayor");
        }

        // Muestra por pantalla el valor mayor
    }

}
