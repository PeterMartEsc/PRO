package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir su tarjeta de crédito en formato XXXX-XXXX-XXXX-XXXX: ");
        String numTarjeta = scanner.nextLine();

        String expReg = "^[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}$";

        Pattern patron = Pattern.compile(expReg);
        Matcher matcher = patron.matcher(numTarjeta);

        if (matcher.matches()) {
            System.out.println("El número de tarjeta es válido");
        } else {
            System.out.println("El número de tarjeta no es valido");
        }
    }
}
