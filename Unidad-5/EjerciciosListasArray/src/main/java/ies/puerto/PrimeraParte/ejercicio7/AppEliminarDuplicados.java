package ies.puerto.PrimeraParte.ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppEliminarDuplicados {

    static List<String> lista;

    public static void main(String[] args) {

        lista = new ArrayList<>(Arrays.asList("uno", "dos", "agua", "leche", "dos", "leche", "huevos", "aguacate"));

        System.out.println("Lista sin duplicados: " +eliminarCadenasDuplicadas(lista));
    }

    static List<String> eliminarCadenasDuplicadas(List<String> lista){

        List<String> resultado = new ArrayList<>();

        for(String elemento : lista)
            if(!resultado.contains(elemento)){
                resultado.add(elemento);
            }

        return resultado;
    }
}
