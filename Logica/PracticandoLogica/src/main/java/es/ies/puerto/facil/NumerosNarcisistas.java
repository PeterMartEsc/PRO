package es.ies.puerto.facil;

import java.util.Scanner;

public class NumerosNarcisistas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        int numero = scanner.nextInt();

        String numeroString = Integer.toString(numero);
        int suma = 0;

        for(int i=0; i<numeroString.length(); i++){

            char caracter = numeroString.charAt(i);
            int numeroSplited = Character.getNumericValue(caracter);
            suma += (numeroSplited*numeroSplited*numeroSplited);
        }

        if(suma == numero){
            System.out.println("El número introducido es un número Amstrong");
        } else {
            System.out.println("El número introducido no es un numero Amstrong");
        }
    }
}
