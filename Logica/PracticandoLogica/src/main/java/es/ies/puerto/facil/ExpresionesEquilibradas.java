package es.ies.puerto.facil;

import java.util.HashSet;
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

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(char caracter : Str1.toCharArray()){
            set1.add(caracter);
        }

        for(char caracter : Str2.toCharArray()){
            set2.add(caracter);
        }

        for(char caracter : set1){
            if(!set2.contains(caracter)){
                out1+=caracter;
            }
        }

        for(char caracter : set2){
            if(!set1.contains(caracter)){
                out2+=caracter;
            }
        }

        System.out.println("Los elementos de " +Str1+ " no hallados en " +Str2+ " son los siguientes: \n" +out1);
        System.out.println("Los elementos de " +Str2+ " no hallados en " +Str1+ " son los siguientes: \n" +out2);
    }
}
