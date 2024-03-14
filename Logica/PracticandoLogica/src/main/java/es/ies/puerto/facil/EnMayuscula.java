package es.ies.puerto.facil;

import java.util.Scanner;

public class EnMayuscula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena de texto: ");
        String cadena = scanner.nextLine();

        String DELIMITADOR = " ";
        String resultadoFrase = "";

        for(String palabra : cadena.split(DELIMITADOR)){
            String resultadoPalabra = "";

            for(int i = 0; i<palabra.length();i++){

                if(i == 0){
                    char caracter = palabra.charAt(i);
                    String caracterString = String.valueOf(caracter);
                    String caracterDefinitivo = caracterString.toUpperCase();
                    resultadoPalabra += caracterDefinitivo;
                } else {
                    char caracter = palabra.charAt(i);
                    String caracterString = String.valueOf(caracter);
                    resultadoPalabra += caracterString;
                }
            }

            resultadoFrase += resultadoPalabra+" ";

        }
        System.out.println("La frase procesada es: " +resultadoFrase);


    }
}
