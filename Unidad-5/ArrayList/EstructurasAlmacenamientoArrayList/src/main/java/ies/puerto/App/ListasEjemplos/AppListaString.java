package ies.puerto.App.ListasEjemplos;

import java.util.ArrayList;
import java.util.List;

public class AppListaString {

    static List<String> miListaString;

    public static void main(String[] args) {
        String dni1 = "00000000H";
        String dni2 = "11111111H";
        miListaString = new ArrayList<>();

        miListaString.add(dni1);
        miListaString.add(dni2);
        System.out.println(miListaString);

        boolean existe = existeElement(dni1);
        if (existe){
            System.out.println("Existe el elemento " +dni1+ " en la lista: " +miListaString);
        }

        existe = existeElement("1234");
        if (!existe){
            System.out.println("No existe elemento 1234 en la lista: " +miListaString);
        }
    }

    public static boolean existeElement(String elemento) {

        return miListaString.contains(elemento);
    }
}
