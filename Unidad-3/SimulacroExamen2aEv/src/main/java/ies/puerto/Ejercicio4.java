package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el valor que quiera pasar a binario: ");
        int binNumero = scanner.nextInt();

        String binario = Integer.toBinaryString(binNumero);

        System.out.println(binario);
    }
}
