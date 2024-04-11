package es.ies.puerto;

/**
 * Escribe una función recursiva llamada cuentaRegresiva() que imprima los números del 10 al 1 en orden descendente.
 * @author Pedro Martín Escuela
 */
public class Ejercicio1 {

    public int factorialTradicional(int numero){
        int resultado = 1;
        for(int i = 1; i<=numero; i++){
            resultado *= i;
        }
        return resultado;
    }

    public int factorial(int numero){
        if(numero == 0){
            return 1;
        }
        return numero*factorial(numero-1);
    }
}
