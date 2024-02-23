package ies.puerto.PrimeraParte.ejercicio8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppMayoresDiez {

    static List<Integer> listaNumeros;

    public static void main(String[] args) {

        listaNumeros = new ArrayList<>(Arrays.asList(12, 34, 2, 27, 11, 10, 9));

        if(comprobarMayoresDiez(listaNumeros)){
            System.out.println("Todos los elementos del array son mayores de 10");
        } else {
            System.out.println("Hay algún elemento en el array que no es mayor de 10");
        }

    }

    static boolean comprobarMayoresDiez(List<Integer> listaNumeros){

        int contador = 0;

        for(int element : listaNumeros){
            if(element > 10){
                contador++;
            }

            if(contador == listaNumeros.size()){
                return true;
            }
        }
        return false;
    }
}
