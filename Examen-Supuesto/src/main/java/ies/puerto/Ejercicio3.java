package ies.puerto;

import java.util.Scanner;

/**
 * Programa para determinar la evaluación de un alumno a partir de una nota
 * @author PeterMartEsc
 */

public class Ejercicio3 {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        float nota = scanner.nextFloat();

        System.out.println("Su evaluacion calculada por If/Else es: " +calcularNotaIfElse(nota) );
        System.out.println("Su evaluación calculada por Switch es: " +calcularNotaSwitch(nota));
    }

    public static String calcularNotaIfElse (float nota){

        String evaluacion = "Por definir";

        if (nota >= 0f && nota <= 4.99f) {
            evaluacion = "Suspenso";
        } else if (nota >=5f && nota <=5.99f) {
            evaluacion = "Aprobado";
        } else if (nota >= 6f && nota <= 6.99f) {
            evaluacion = "Bien";
        } else if (nota >= 7f && nota <= 8.99f) {
            evaluacion = "Notable";
        } else if (nota >= 9f && nota <= 9.99f) {
            evaluacion = "Sobresaliente";
        } else if (nota == 10f) {
            evaluacion = "Matrícula";
        } else {
            System.out.println("Introduzca un valor entre 0 y 10");
        }

        return evaluacion;
    }

    public static String calcularNotaSwitch (float nota){

        String evaluacion = "Por definir";

        int enteroNota = (int) nota;

        switch(enteroNota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                evaluacion = "Suspenso";
                break;
            case 5:
                evaluacion = "Aprobado";
                break;
            case 6:
                evaluacion = "Bien";
                break;
            case 7:
            case 8:
                evaluacion = "Notable";
                break;
            case 9:
                evaluacion = "Sobrealiente";
                break;
            case 10:
                evaluacion = "Matricula";
                break;
        }
        return evaluacion;
    }
}