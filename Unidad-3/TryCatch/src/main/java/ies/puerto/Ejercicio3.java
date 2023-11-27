package ies.puerto;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[]array = {1,2,3};

        try{
            System.out.println("" +array[3]);

        } catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("El tamaño del array es de 3 números: " + arrayIndexOutOfBoundsException.getMessage());
        }
    }
}