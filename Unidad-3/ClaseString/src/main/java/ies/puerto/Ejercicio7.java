package ies.puerto;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la frase");
        String frase = scanner.nextLine();

        String sinEspacios = frase.trim();
        System.out.println("Su frase sin espaciado al principio y final es: " +sinEspacios);
    }
}