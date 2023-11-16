package ies.puerto;

import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[]array1 = new int [5];
        int[]array2 = new int [5];
        int[]array3 = new int [5];

        for(int i=0; i<array1.length; i++) {
            System.out.println("Introduzca el valor " + (i + 1) + " del primer array: ");
            array1[i] = scanner.nextInt();
        }

        for(int i=0; i<array2.length; i++) {
            System.out.println("Introduzca el valor " + (i + 1) + " del segundo array");
            array2[i] = scanner.nextInt();
        }

        System.out.println("La suma final de los array es: " + Arrays.toString(sumaArray(array1, array2, array3)));
    }

    public static int[] sumaArray(int[]array1, int[]array2, int[]array3){

        for(int i = 0; i < array1.length; i++){
            array3[i] = array1[i] + array2[i];
        }

        return array3;
    }
}