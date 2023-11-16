package ies.puerto;

import java.util.Scanner;


public class Ejercicio4 {

    public void crearMatriz(){

        int[][] matriz = new int[5][5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println();
            }
        }

    }

    public void suma (int[][]matriz){

        int sumaFila=0;
        int sumaColumna = 0;

        for (int i = 0; i < matriz.length; i++){
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println();
                sumaFila +=matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            System.out.println("Valor de la fila: " +(i+1)+ "=" +sumaFila);
            System.out.println("Valor de la columna: " +(i+1)+ "=" +sumaColumna);
        }
    }
}
