package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos
 * en las variables A, B y C respectivamente. El algoritmo debe imprimir
 * cual es el mayor y cual es el menor. Recuerde constatar que los tres
 * valores introducidos por el teclado sean valores distintos. Presente
 * un mensaje de alerta en caso de que se detecte la introducción de
 * valores iguales.
 */
public class Ejercicio2 {

    public static void main(String[] args){

        int valorA;
        int valorB;
        int valorC;

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

            System.out.println("Ingrese el valor de la variable C:");
            valorC = lectura.nextInt();
            System.out.println("Valor de la variable C:"+valorC);

            if ((valorA == valorB)||(valorA == valorC) || (valorB == valorC)) {
                System.out.println("Dos o mas valores son iguales");
            }
        }while ((valorA == valorB)||(valorA == valorC) || (valorB == valorC));

        if ((valorA > valorB) && (valorA>valorC)) {
            System.out.println("Valor A es el mayor");
            if (valorC < valorB){
                System.out.println("Valor C es el menor");
            } else {
                System.out.println("Valor B es el menor");
            }
        } else if ((valorB > valorA)&&(valorB>valorC)) {
            System.out.println("Valor B es el mayor");
            if (valorC < valorA){
                System.out.println("Valor C es el menor");
            } else {
                System.out.println("Valor A es el menor");
            }
        } else {
            System.out.println("Valor C es el mayor");
            if (valorB < valorA){
                System.out.println("Valor B es el menor");
            } else {
                System.out.println("Valor A es el menor");
            }
        }


    }

}
