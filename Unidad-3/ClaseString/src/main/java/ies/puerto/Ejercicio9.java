package ies.puerto;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el texto: ");
        String frase = scanner.nextLine();

        if(empiezaAcaba(frase)){
            System.out.println("Su frase empieza o acaba con el termino 'Pedro'");
        } else {
            System.out.println("Su frase ni empieza ni acaba con el termino 'Pedro'");
        }

    }

    public static boolean empiezaAcaba(String frase) {

        boolean empiezaPor = frase.startsWith("Pedro");
        boolean acabaPor = frase.endsWith("Pedro");

        if(empiezaPor == frase.startsWith("Pedro")){
            return true;
        } else if (acabaPor == frase.endsWith("Pedro")) {
            return true;
        }

        /*Como hacer bien el return*/
    }

}
