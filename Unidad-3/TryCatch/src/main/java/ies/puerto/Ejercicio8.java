package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int division;
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingrese el primer número a dividir: ");
            int dividendo = scanner.nextInt();
            System.out.println("Ingrese el número por el cual dividiremos: ");
            int divisor = scanner.nextInt();

            division = dividendo/divisor;
            System.out.println("Resultado: " +division);

        } catch(InputMismatchException inputMismatchException){
            System.out.println("El dato introducido no es un número" +inputMismatchException);
        }

    }
}
