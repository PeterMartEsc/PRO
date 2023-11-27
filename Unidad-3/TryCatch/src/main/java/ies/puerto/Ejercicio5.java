package ies.puerto;

public class Ejercicio5 {

    /**
     * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc")
     * y trata de evaluarla. Maneja la excepción ArithmeticException u otra excepción adecuada.
     * @param args
     */

    public static void main(String[] args) {

        String String = "abc";
        String suma;                /*Solo me deja creandola como int*/

        suma = (2+String);
        System.out.println(suma);
    }
}
