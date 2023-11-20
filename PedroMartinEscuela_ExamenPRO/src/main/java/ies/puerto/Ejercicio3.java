package ies.puerto;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[][]ficha = new int[7][7];

        for(int i=0; i < ficha.length; i++){
            for(int j=0; j<ficha.length; j++){
                ficha[i][j] = j;
                System.out.println(i+ ":" +ficha[i][j]);
            }
        }
    }
}

/**
 * |0:0 0:1 0:2 0:3 0:4 0:5 0:6|
 * |    1:1 1:2 1:3 1:4 1:5 1:6|
 * |        2:2 2:3 2:4 2:5 2:6|
 * |            3:3 3:4 3:5 3:6|
 * |                4:4 4:5 4:6|
 * |                    5:5 5:6|
 * |                        6:6|
 */
/**
 * ficha[j][0] = j;
 * System.out.println(i+ ":" +ficha[j][0]);
 */