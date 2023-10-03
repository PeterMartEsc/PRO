package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita leer un valor
 * entero positivo N y determinar si es primo o no.
 */
public class Ejercicio6 {
    public static void main(String[] args){
        int numero;
        boolean primo = true;
        Scanner lectura = new Scanner (System.in);

        System.out.println("Ingrese el valor del numero: ");
        numero = lectura.nextInt();
        System.out.println("Valor de la variable numero:"+numero);

        int contador = 2;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        if (primo == true) { // es lo mismo (primo)
            System.out.println("El numero:"+ numero +", SI es primo");
        } else {
            System.out.println("El numero:"+ numero +", NO es primo");
        }
    }

}
