package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        int numero1 = solicitarNumero();
        int numero2 = solicitarNumero();
        int resultado = division(numero1, numero2);
        System.out.println("Resultado de la división: " + resultado);

    }

    /**
     * Función que devuelve por teclado un numero
     * @return numero obtenido
     */

    public static int solicitarNumero(){

        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un valor: ");
        numero = scanner.nextInt();

        return  numero;
    }

    /**
     * Función que realiza la división de dos numeros
     * @param dividendo de la división
     * @param divisor de la división
     * @return resultado
     */

    public static int division(int dividendo, int divisor) throws Exception {

        int resultado = 0;

        try{
            resultado = dividendo/divisor;

        } catch (ArithmeticException e){
            String mensajeError = "Se intenta realizar una división por 0";
            System.out.println("Mensaje del println " + mensajeError);

            throw new Exception(mensajeError);
        }

        return resultado;
    }
}
