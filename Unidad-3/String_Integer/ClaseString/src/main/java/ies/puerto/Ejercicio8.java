package ies.puerto;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el texto a convertir en mayúsculas: ");
        String frase1 = scanner.nextLine();

        System.out.println("Itroduzca el texto a convertir en minúsculas: ");
        String frase2 = scanner.nextLine();

        String mayusc = frase1.toUpperCase();
        String minusc = frase2.toLowerCase();

        System.out.println("Texto en Mayusculas: " +mayusc);
        System.out.println("Texto en minusculas: " +minusc);
    }
}
