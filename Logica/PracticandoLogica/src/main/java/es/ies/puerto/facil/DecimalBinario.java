package es.ies.puerto.facil;

import java.util.Scanner;

public class DecimalBinario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el número decimanl: ");
        int numeroDecimal = scanner.nextInt();

        System.out.println("El numero decimal en binario es: " +conversorBinario(numeroDecimal));
    }

    public static String conversorBinario(int numeroDecimal){

        if(numeroDecimal == 0){
            return "0";
        }

        String numeroBinario = "";

        while(numeroDecimal > 0){

            numeroBinario = numeroDecimal%2 + numeroBinario;

            numeroDecimal /= 2;
        }

        return numeroBinario;

    }
}
