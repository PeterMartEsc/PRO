package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el valor numérico: ");
        int numero = scanner.nextInt();

        int suma = 0;

        Integer numeroValor = Integer.valueOf(numero);
        String stringNumero = numeroValor.toString();

        for(int i = 0; i<stringNumero.length(); i++){

            char digito = stringNumero.charAt(i);
            suma += Character.getNumericValue(digito);

            System.out.println(suma);
        }

        System.out.println("La suma final es: " +suma);



    }
}
