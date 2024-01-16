package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

    /**
     * Implementa un validador que verifique si una cadena sigue el formato de fecha común (por ejemplo, DD/MM/AAAA).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir fecha: ");
        String fecha = scanner.nextLine();

        String expReg = "^[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}$";

        Pattern patron = Pattern.compile(expReg);
        Matcher matcher = patron.matcher(fecha);

        if (matcher.matches()) {
            System.out.println("La fecha es válida");
        } else {
            System.out.println("La fecha no es valida");
        }
    }
}
