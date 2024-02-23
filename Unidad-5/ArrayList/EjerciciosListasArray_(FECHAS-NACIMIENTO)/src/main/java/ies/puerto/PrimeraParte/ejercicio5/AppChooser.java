package ies.puerto.PrimeraParte.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class AppChooser {

    //Nota: Even Numbers es números pares en inglés

    public static void main(String[] args) {

        List<Integer> listaNumeros1 = new ArrayList<>();
        List<Integer> listaPares = new ArrayList<>();

        listaNumeros1.add(1);
        //listaNumeros1.add(2);
        listaNumeros1.add(3);
        //listaNumeros1.add(4);
        listaNumeros1.add(5);
        //listaNumeros1.add(6);

        evenChooser(listaNumeros1, listaPares);

        System.out.println(listaPares);
    }

    /**
     * Método que almacena los números pares en un nuevo array
     * @param listaNumeros1 lista de numeros
     * @param listaPares lista de numeros pares
     * @return lista de numeros pares
     */

    public static List<Integer> evenChooser(List<Integer> listaNumeros1, List<Integer> listaPares){

        for(int elemento : listaNumeros1){
            if(elemento%2==0){
                listaPares.add(elemento);
            }
        }

        return listaPares;
    }
}
