package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * Desarrolla una función recursiva llamada imprimirPares() que imprima todos los números pares del 1 al N.
 * @author Pedro Martín Escuela
 */
public class Ejercicio4 {
    public List<Integer> numerosParesTradicional(int numero){
        List<Integer> resultado = new ArrayList<>();
        for(int i = 0 ; i <=numero ; i+=2){
            resultado.add(i);
        }
        return resultado;
    }

    public List<Integer> numerosParesRecursivo(int numero){
        List<Integer> resultado = new ArrayList<>();
        if(numero == 0){
            resultado.add(numero);
            return resultado;
        }
        if(numero % 2 == 0){
            resultado.add(numero);
            resultado.addAll(numerosParesRecursivo(numero-2));
        }
        return resultado;
    }
}
