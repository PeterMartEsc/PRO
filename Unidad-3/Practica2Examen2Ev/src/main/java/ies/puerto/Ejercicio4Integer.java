package ies.puerto;

import java.util.Scanner;

public class Ejercicio4Integer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número: ");
        int numero = scanner.nextInt();

        int suma = 0;

        Integer integerNumero = numero;
        String texto = String.valueOf(integerNumero);

        for(int i = 0; i < texto.length(); i++){
            char caracter = texto.charAt(i);
            suma += Character.getNumericValue(caracter);
        }

        System.out.println("El resultado de sumar sus dígitos es: "+suma);
    }
}
