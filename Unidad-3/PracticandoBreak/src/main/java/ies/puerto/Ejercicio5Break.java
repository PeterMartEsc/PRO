package ies.puerto;

public class Ejercicio5Break {

    /**
     * Escribe un programa que encuentre el primer número divisible por 5 y mayor que 30, utilizando break
     */

    public static void main(String[] args) {

        for(int i = 31; i < 100; i++){
            if (i % 5 == 0){
                System.out.println("El primer número mayor que 30 y divisible entre 5: " + i);
                break;
            }
        }
    }
}