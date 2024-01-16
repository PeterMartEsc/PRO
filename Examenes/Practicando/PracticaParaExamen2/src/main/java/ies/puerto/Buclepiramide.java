package ies.puerto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del triángulo: ");
        int tamanio = scanner.nextInt();

        if (tamanio%2 != 0){
            tamanio += 1;
        }

        int posicionI;

        for (int i = 3; i >= 0 ; i--){
            posicionI = (tamanio/2) -1;
            for (int j = posicionI; j<tamanio-posicionI ; j++){
                System.out.println("*");
            }
        }


    }
}