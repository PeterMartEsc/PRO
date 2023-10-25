package ies.puerto;

public class Ejercicio2 {

    public String tipoNumero(int numero){

        String resultado = "El numero es negativo";

        if (numero >= 0){
            resultado = "El numero es positivo";
        }

        if (numero%2 == 0){
            resultado += " y par";
        } else {
            resultado += " e impar";
        }

        return resultado;
    }
}
