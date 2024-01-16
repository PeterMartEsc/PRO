package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {

    /**
     * Desarrolla un programa que extraiga todos los números de teléfono válidos (con formato +XX-XXX-XX-XX-XX) de una cadena dada.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su número de teléfono: ");
        String tlf = scanner.nextLine();

        String expReg1 = "^\\+[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}-[0-9]{2}$";
        String expReg2 = "^\\+[0-9]{2}-[0-9]{3}-[0-9]{3}-[0-9]{3}$";

        Pattern patron1 = Pattern.compile(expReg1);
        Matcher matcher1 = patron1.matcher(tlf);

        Pattern patron2 = Pattern.compile(expReg2);
        Matcher matcher2 = patron2.matcher(tlf);

        if (matcher1.matches() || matcher2.matches()) {
            System.out.println("El número de teléfono es válido");
        } else {
            System.out.println("El número de teléfono no es valido");
        }
    }
}
