package ies.puerto;

import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
          Pide el tamaño del triangulo para asignárselo a la matriz
         */

        System.out.println("Introduzca el número de filas del triángulo: ");
        int n = scanner.nextInt();
        int [][] triangulo = new int[n][n];

        /*
          Le dice a cada uno de los valores del array que tiene que ser 1
         */

        for(int i = 0; i<triangulo.length ; i++){
            for(int j = 0; j<triangulo.length ; j++){
                triangulo[i][j] = 1;
                System.out.println(triangulo[i][j]);
            }
        }

    }
}
