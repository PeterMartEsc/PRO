package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {

    public void crearMatriz(){

        int[][] matriz = new int[5][5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

    }


}
