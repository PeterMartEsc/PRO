package ies.puerto;

public class Ejercicio1 {

    /**
     * Escribe un programa que encuentre el primer número divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break
     */

    public static void main(String[] args) {

        for(int i =1; i<=100; i++){
            if ((i % 7 == 0) && (i % 5 == 0)){
                System.out.println("El primer número divisible entre 7 y 5 es: " + i);
                break;
            }
        }

    }
}

/*
  Se puede mejorar usando un boolean haciendo otra función
 */