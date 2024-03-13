package es.ies.puerto.facil;

import java.util.Scanner;

public class ExpresionesEquilibradas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto: ");
        String Str1 = scanner.nextLine();
        System.out.println("Introduzca una otra de texto: ");
        String Str2 = scanner.nextLine();

        int size1 = Str1.length();
        int size2 = Str2.length();

        String out1 = "";
        String out2 = "";

        if(size2>size1){
            String temp = Str1;
            Str1 = Str2;
            Str2 = temp;
        }


        for(int i=0; i < size1 ; i++){
            int contador = 0;
            char caracter1 = Str1.charAt(i);
            for(int j = 0; j<size2;j++){
                char caracter2 = Str2.charAt(i);
                if(caracter1 == caracter2){
                    out1 = caracter1 + out1;
                    contador++;
                }
            }
            if(contador ==0){
                out2 = caracter1 + out2;
            }
        }

        if(size2>size1){
            String temp = out1;
            out1 = out2;
            out2 = temp;
        }
        System.out.println("Los elementos presentes en " +Str1+ " y no presentes en " +Str2+ " son: " +out1);
        System.out.println("Los elementos presentes en " +Str2+ " y no presentes en " +Str1+ " son: " +out2);

    }
}
