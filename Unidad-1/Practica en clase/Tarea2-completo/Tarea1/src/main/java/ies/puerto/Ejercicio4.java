package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita leer un valor
 * cualquiera N y escriba si dicho número es par o impar.
 */
public class Ejercicio4 {
    public static void main(String[] args){

        int numero;
        Scanner lectura = new Scanner (System.in);

        System.out.println("Ingrese el valor del numero: ");
        numero = lectura.nextInt();
        System.out.println("Valor de la variable numero:"+numero);

        if (numero % 2 == 0) {
            System.out.println("El numero:"+numero+", es par");
        } else {
            System.out.println("El numero:"+numero+", es impar");
        }

    }

}
