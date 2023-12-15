package ies.puerto;

import java.util.Scanner;

public class Ejercicio7Integer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número: ");
        int numero = scanner.nextInt();

        String numBinario = Integer.toBinaryString(numero);

        System.out.println("Su número en binario es: " +numBinario);

    }
}
