package ies.puerto.PrimeraParte.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class AppElementoComun {
    public static void main(String[] args) {

        List<Integer> listaEnteros1= new ArrayList<>();
        List<Integer> listaEnteros2 = new ArrayList<>();

        listaEnteros1.add(5);
        listaEnteros1.add(4);
        listaEnteros1.add(9);

        listaEnteros2.add(1);
        listaEnteros2.add(8);
        listaEnteros2.add(4);

        if (compararNumerosRecursivo(listaEnteros1, listaEnteros2)){
            System.out.println("Las dos listas comparten un elemento");
        } else {
            System.out.println("Las dos listas no comparten ningún elemento");
        }
    }

    /**
     * Método que compara dos listas y si encuentra un elemento común, devuelve true
     * @param listaEnteros1 primera lista de enteros
     * @param listaEnteros2 primera lista de enteros
     * @return true/false dependiendo de si hay elementos comunes o no
     */

    public static boolean compararNumeros(List<Integer> listaEnteros1, List<Integer> listaEnteros2){

        if(listaEnteros2.size() > listaEnteros1.size()){
            List<Integer> temporal = listaEnteros1;
            listaEnteros1=listaEnteros2;
            listaEnteros2=temporal;
        }

        for(int elemento : listaEnteros1){
            if(listaEnteros2.contains(elemento)){
                return true;
            }
        }
        return false;
    }

    //En este caso, es más optima la recursividad, en un caso más complejo, es mejor el método de arriba

    public static boolean compararNumerosRecursivo(List<Integer> listaEnteros1, List<Integer> listaEnteros2){

        if(listaEnteros2.size() > listaEnteros1.size()){
            compararNumerosRecursivo(listaEnteros2, listaEnteros1);
        }

        for(int elemento : listaEnteros1){
            if(listaEnteros2.contains(elemento)){
                return true;
            }
        }

        return false;
    }

}
