package ies.iespuerto;

/**
 * @author PeterMartEsc
 * Entrega num 1
 */

import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
 */

public class Codigo_tarea1 {


    public static void main(String[] args) {

        int N, nota;        //Declaramos las variables que van a sevirnos para hacer la media
        int suma=0;
        float media;

        Scanner lectura = new Scanner (System.in);

        System.out.println("Introduzca el número de notas para calcular su media:");        //Iniciamos un bucle para evitar fallos
        N = lectura.nextInt();
        System.out.println("Se calculará la media de " + N + " notas");

        int i = 1;

        while (i<=N && N!=0){
            System.out.println("Introduzca la nota: ");
            nota = lectura.nextInt();
            suma += nota;   //suma = suma +nota

        }
        media = (float) suma / N;                                           //Ponemos el final del programa, calculando la media
        System.out.println("La media de las notas es:" + media);
    }
}