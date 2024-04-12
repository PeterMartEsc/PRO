package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * Escribe una función recursiva llamada cuentaRegresiva() que imprima los números del 10 al 1 en orden descendente.
 * @author Pedro Martín Escuela
 */
public class Ejercicio2 {

    public List<Integer> cuentaDescencenteTradicional(int numero){
        List<Integer> lista = new ArrayList<>();
        for(int i = numero; i>=0 ; i--){
            lista.add(i);
        }
        return lista;
    }

    public List<Integer> cuentaDescencenteRecursiva(int numero) {
        List<Integer> lista = new ArrayList<>();
        lista.add(numero);
        if(numero == 0){
            return lista;
        }
        lista.addAll(cuentaDescencenteRecursiva(numero-1));
        return lista;
    }
}