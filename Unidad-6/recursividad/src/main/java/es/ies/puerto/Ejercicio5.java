package es.ies.puerto;

/**
 * Implementa una función recursiva llamada potencia() para calcular la potencia de un número base
 * elevado a un exponente dado.
 * @author Pedro Martín Escuela
 */
public class Ejercicio5 {

    public int potenciaTradicional(int base, int exponente){
        if(exponente == 0){
            return 1;
        }

        int resultado = 1;

        for(int i=1; i<=exponente;i++){
            resultado *= base;
        }

        return resultado;
    }

    public int potenciaRecursivo(int base, int exponente){
        if(exponente == 0){
            return 1;
        }

        if(exponente == 1){
            return base;
        }

        return base * potenciaRecursivo(base, exponente - 1);
    }
}
