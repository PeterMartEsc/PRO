package ies.puerto;

public class Ejercicio5 {

    public static void main(String[] args) {

        for(int i = 31; i < 1000; i++){
            if (i % 5 == 0){
                System.out.println("El primer número divisible entre 7 y 5 es: " + i);
                break;
            }
        }

    }
}
