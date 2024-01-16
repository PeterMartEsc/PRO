package ies.puerto;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura del triángulo: ");
        int altura = scanner.nextInt();

        dibujarTriangulo(altura);

        scanner.close();
    }

    public static void dibujarTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            // Espacios en blanco antes de los números '1'
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Números '1' correspondientes a la fila actual
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("1");
            }

            System.out.println(); // Cambio de línea para la siguiente fila
        }
    }
}
