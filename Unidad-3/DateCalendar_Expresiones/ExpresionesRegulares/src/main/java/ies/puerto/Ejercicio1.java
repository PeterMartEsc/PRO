package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

    /**
     * Crea un programa que valide si una cadena es una dirección de correo electrónico válida utilizando expresiones regulares.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Correo electrónico: ");
        String email = scanner.nextLine();

        String expReg = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern patron = Pattern.compile(expReg);
        Matcher matcher = patron.matcher(email);

        if (matcher.matches()) {
            System.out.println("La dirección de correo electrónico es válida");
        } else {
            System.out.println("La dirección de correo no es valida");
        }

    }
}
