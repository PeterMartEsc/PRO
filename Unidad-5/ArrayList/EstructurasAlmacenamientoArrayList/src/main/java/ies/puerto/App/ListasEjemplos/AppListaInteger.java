package ies.puerto.App.ListasEjemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppListaInteger {
    static List<Integer> miListaEnteros;

    public static void main(String[] args) {
        miListaEnteros = new ArrayList<>();

        addElement(1);
        addElement(2);

        List<Integer> subSubLista = new ArrayList<>();
        subSubLista.add(3);
        subSubLista.add(4);
        addSublista(subSubLista);

        System.out.println(miListaEnteros);
    }

    public static boolean addElement(Integer elemento) {
        return miListaEnteros.add(elemento);
    }

    public static boolean removeElement(Integer elemento) {
        return miListaEnteros.remove(elemento);
    }

    public static boolean addSublista(Collection subLista) {
        return miListaEnteros.addAll(subLista);
    }
}
