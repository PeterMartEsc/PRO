package ies.puerto.PrimeraParte.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class AppOperacionesArrayList {

    static List<String> listaCadenas;

    public static void main(String[] args) {

        listaCadenas = new ArrayList<>();

        listaCadenas.add("No comienzo por 'A'");
        listaCadenas.add("Tampoco comienzo por 'A'");
        listaCadenas.add("Aveces comienzo por 'A'");
        listaCadenas.add("Adiós mundo cruel");
        listaCadenas.add("El profe de programación es el mejor");
        listaCadenas.add("Le vamos a traer una caja de dulces");
        listaCadenas.add("Angelo trae la caja de dulces");

        int contador = 0;

        for (String cadena : listaCadenas){
            if(comienzaPorA(cadena)){
                contador ++;
            }
        }
        System.out.println("Número de cadenas que comienzan por 'A': " +contador);
    }

    private static boolean comienzaPorA(String cadena) {

        String regex = "^[a|A].*";

        if(Pattern.matches(regex, cadena)){
            return true;
        }

        return false;
    }
}
