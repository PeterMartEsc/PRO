package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio5 {

    /**
     * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc")
     * y trata de evaluarla. Maneja la excepción ArithmeticException u otra excepción adecuada.
     * @param args
     */

    public static void main(String[] args) throws Exception {

       Scanner scanner = new Scanner(System.in);
       try{
           System.out.println("Ingresa una operación matemática");
           int operacion = scanner.nextInt();

       } catch (InputMismatchException exception){
           throw new Exception("El tipo de entrada no se corresponde con el tipo de dato esperando, imposible realizar una operación matemática en un scaner");
          /* falta */
       }

    }
}
