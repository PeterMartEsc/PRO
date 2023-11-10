package ies.puerto;

import java.util.Scanner;

/**
 * Ejercicio 4 del simulacro de exámen
 *
 */

public class Banco {

    private String titular;
    private double saldo;

    /**
     * Primer constructor
     * @param titular de la cuenta bancaria
     */

    public Banco(String titular) {
        this.titular = titular;
    }

    /**
     * Segundo constructor
     * @param saldo de la cuenta bancaria
     */

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor con las dos variables
     * @param titular de la cuenta bancaria
     * @param saldo de la cuenta bancaria
     */

    public Banco(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     * Getters y Setters pedidos por el ejercicio
     * @return
     */

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    Scanner scanner = new Scanner(System.in);

    /**
     * Método para ingresar dinero
     * @param saldo de la cuenta
     */
    public void depositarDinero (double saldo){

        System.out.println("Introduzca el valor del ingreso: ");
        float ingreso = scanner.nextFloat();

        saldo = this.saldo+ingreso;

        this.saldo = saldo;
    }

    /**
     * Método para retirar dinero
     * @param saldo de la cuenta
     */
    public void retirarDinero (double saldo){

        System.out.println("Introduzca el dinero que desea retirar: ");
        float retiro = scanner.nextFloat();

        saldo = this.saldo-retiro;

        this.saldo = saldo;
    }

    /**
     * Imprimir la información de la cuenta
     */
    public void imprimirInfoCuenta(){
        System.out.println("Titular: " +titular);
        System.out.println("Saldo: " +saldo);
    }
}
