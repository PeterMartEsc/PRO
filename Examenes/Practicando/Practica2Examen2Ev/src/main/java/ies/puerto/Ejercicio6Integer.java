package ies.puerto;

import java.util.Scanner;

public class Ejercicio6Integer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero: ");
        Integer numero = scanner.nextInt();

        Integer cero = 0;

        int result = numero.compareTo(cero);

        if (result == 0){
            System.out.println("El número es cero");
        } else if (result > 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
