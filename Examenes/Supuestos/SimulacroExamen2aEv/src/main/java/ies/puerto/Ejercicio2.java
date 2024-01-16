package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su texto: ");
        String cadena = scanner.nextLine();

        cadena = cadena.toLowerCase();

        System.out.println("La cadena contiene " +contadorVocales(cadena)+ " vocales.");
    }

    public static int contadorVocales (String cadena){

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++){

            char caracter = cadena.charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contador ++;
            }
        }

        return contador;
    }
}
