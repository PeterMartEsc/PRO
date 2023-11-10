package ies.puerto;

import java.util.Scanner;

public class Ej3Switch {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        float nota = scanner.nextFloat();

        System.out.println("Su evaluación calculada por Switch es: " +calcularNotaSwitch(nota));

    }

    public static String calcularNotaSwitch (float nota){

        String evaluacion = "Suspenso";

        switch((int) nota){
            case 5:
                evaluacion = "Aprobado";
            case 6:
                evaluacion = "Bien";
            case 7:
                evaluacion = "Notable";
            case 8:
                evaluacion = "Notable";
            case 9:
                evaluacion = "Sobrealiente";
            case 10:
                evaluacion = "Matricula";
        }
        return evaluacion;
    }
}

