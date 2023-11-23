package ies.puerto;

public class Ejercicio2 {

    /**
     * Escribe un programa que encuentre el primer número primo mayor que 100 , utilizando break
     */

    public static void main(String[] args) {

        for (int num = 100; num <= 1000 ; num++){
            if(esPrimo(num)){
                System.out.println("El primer número primo mayor que 100 es: " +num);
                break;
            }
        }

    }

    public static boolean esPrimo(int num){

        if (num <= 1){
            return false;
        }

        for (int i = 2; i < num / 2; i++){
            if (num % i == 0){
                return false;
            }
        }


        return true;
    }
}