package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {

    public static void calcularNota() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        float nota = scanner.nextInt();

        String evaluacion;

        if (nota <= 4.99 && nota >= 0) {
            evaluacion = "Suspenso";
        } else if (nota >=5 && nota <=6) {
            evaluacion = "Aprobado";
        } else if (nota >= 6 && nota <= 6.99) {
            evaluacion = "Bien";
        } else if (nota >= 7 && nota <= 8.99) {
            evaluacion = "Notable";
        } else if (nota >= 9 && nota <= 9.99) {
            evaluacion = "Sobresaliente";
        } else if (nota == 10) {
            evaluacion = "Matrícula";
        } else
            System.out.println("Introduzca un valor entre 0 y 10");
    }
}