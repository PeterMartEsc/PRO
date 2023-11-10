package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        float nota = scanner.nextFloat();

        String evaluacion = "Por definir";

        if (nota >= 0 && nota <= 4.99) {
            evaluacion = "Suspenso";
        } else if (nota >=5 && nota <=5.99) {
            evaluacion = "Aprobado";
        } else if (nota >= 6 && nota <= 6.99) {
            evaluacion = "Bien";
        } else if (nota >= 7 && nota <= 8.99) {
            evaluacion = "Notable";
        } else if (nota >= 9 && nota <= 9.99) {
            evaluacion = "Sobresaliente";
        } else if (nota == 10) {
            evaluacion = "Matrícula";
        } else {
            System.out.println("Introduzca un valor entre 0 y 10");
        }

        System.out.println("Tu evaluacion: " + evaluacion);
    }


}