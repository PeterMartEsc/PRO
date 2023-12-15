package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1Integer {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca el número a analizar: ");
            int numero = scanner.nextInt();

            if(numero%2 == 0){
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }
        } catch (InputMismatchException e){
            System.out.println("Error: Ingrese un número válido");
        }
    }
}