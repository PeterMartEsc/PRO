package ies.puerto;

import java.util.Scanner;

public class Ejercicio2Integer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su número: ");
        int numero = scanner.nextInt();
        System.out.println("Lo almacenaremos en un int y lo pasaremos a String");

        Integer numeroValor = Integer.valueOf(numero);
        String texto = numeroValor.toString();
        System.out.println("String: " +texto);

    }
}
