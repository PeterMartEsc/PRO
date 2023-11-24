package ies.puerto;

public class Ejercicio4Break {

    public static void main(String[] args) {

        int[]num = new int[]{4, 7, 8, 10, -3, 6, 9};


        for(int i = 0 ; i < num.length; i++){
            if(num[i] < 0){
                System.out.println("He encontrado el número negativo en la posición: " + i);
                break;
            }
        }

    }

}
