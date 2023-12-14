package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto: ");
        String cadena = scanner.nextLine();

        if (cadena.length() >= 10){
            System.out.println(invertirCadena(cadena));
        } else {
            System.out.println("La cadena debe contener al menos 10 caracteres");
        }

    }

    public static String invertirCadena (String cadena){

        char[] caracteres = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {

            caracteres[i] = cadena.charAt(cadena.length() -1 -i);
        }

        return new String (caracteres);
    }
}