package ies.puerto;

public class Ejercicio3Break {

    public static void main(String[] args) {

        int[]num = new int[]{3, 8, 10, 5, 9, 7};


        for(int i = 0 ; i < num.length; i++){
            if(num[i] == 7){
                System.out.println("He encontrado el número 7 en la posición: " + i);
                break;
            }
        }

    }
}

/**
 * ??
 */