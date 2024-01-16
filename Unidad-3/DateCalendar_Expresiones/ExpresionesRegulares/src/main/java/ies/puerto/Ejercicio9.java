package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la url: ");
        String url = scanner.nextLine();

        String expReg = "^https://www\\.\\w+\\.[a-z]{3}\\/";

        Pattern patron = Pattern.compile(expReg);
        Matcher matcher = patron.matcher(url);

        if (matcher.matches()) {
            System.out.println("La url es válida");
        } else {
            System.out.println("La url no es valida");
        }
    }
}
