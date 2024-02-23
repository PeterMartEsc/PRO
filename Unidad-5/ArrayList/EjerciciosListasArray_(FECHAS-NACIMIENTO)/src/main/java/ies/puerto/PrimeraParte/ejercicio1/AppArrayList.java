package ies.puerto.PrimeraParte.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class AppArrayList {

    static List<Integer> listaNumerosPares;

    static List<Integer> listaNumerosImpares;

    public static void main(String[] args) {

        listaNumerosPares = new ArrayList<>();
        listaNumerosImpares = new ArrayList<>();

        for(int i = 1 ; i <= 10 ; i++){

            if(esNumeroPar(i)){
                listaNumerosPares.add(i);
            } else {
                listaNumerosImpares.add(i);
            }
        }

        System.out.println("Lista de números pares: " +listaNumerosPares);
        System.out.println("Tamaño: " +listaNumerosPares.size());
        System.out.println("Lista de números impares: " +listaNumerosImpares);
        System.out.println("Tamaño: " +listaNumerosImpares.size());
    }

    /**
     * Función que verifica si un númeor es par
     * @param i numero a verificar
     * @return true/false si es o no par
     */

    private static boolean esNumeroPar(int i){

        if(i%2==0){
            return true;
        }

        return false;
    }

}
