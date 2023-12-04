package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Introduzca la cadena de texto a analizar: ");
        String cadena = scanner.nextLine();

        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            // Verificar si el caracter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        System.out.println("Hay " +contador+ " vocales en la cadena");
    }
}
