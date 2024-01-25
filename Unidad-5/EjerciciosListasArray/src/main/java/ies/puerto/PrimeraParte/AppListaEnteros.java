package ies.puerto.PrimeraParte;

import java.util.ArrayList;
import java.util.List;

public class AppListaEnteros {

    static List<Integer> miListaEnteros;

    public static void main(String[] args) {

        miListaEnteros = new ArrayList<>();

        addElement(1);
        addElement(2);
        addElement(3);
        addElement(4);
        addElement(5);
        addElement(6);
        addElement(7);
        addElement(8);
        addElement(9);
        addElement(10);

        System.out.println(miListaEnteros);
    }

    public static boolean addElement(Integer elemento) {
        return miListaEnteros.add(elemento);
    }
}
