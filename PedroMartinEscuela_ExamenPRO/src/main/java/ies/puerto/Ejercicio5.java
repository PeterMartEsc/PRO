package ies.puerto;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Ejercicio5 {

    /**
     * Este método escanea y devuelve el més correspondiente al número
     * @param args
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Introduza el numero del mes: ");
        numero = scanner.nextInt();

        System.out.println("El numero corresponde al més (If/Else): " +mesIfSele(numero));
        System.out.println("El numero corresponde al més (Switch): " +mesSwitch(numero));
    }

    /**
     * Eswte método calcula el més correspondiente al número mediante If,Else
     * @param numero dado por el usuario
     * @return
     */

    public static String mesIfSele(int numero){

        String mes = "Por determinar";

        if(numero == 1){
            mes = "Enero";

        } else if(numero == 2){
            mes ="Febrero";

        } else if(numero == 3){
            mes ="Marzo";

        } else if(numero == 4){
            mes ="Abril";

        } else if(numero == 5){
            mes ="Mayo";

        } else if(numero == 6){
            mes ="Junio";

        } else if(numero == 7){
            mes ="Julio";

        } else if(numero == 8){
            mes ="Agosto";

        } else if(numero == 9){
            mes ="Septiembre";

        } else if(numero == 10){
            mes ="Octubre";

        } else if(numero == 11){
            mes ="Noviembre";

        } else if(numero == 12){
            mes ="Diciembre";
        }

        return mes;
    }

    /**
     * Eswte método calcula el més correspondiente al número mediante Switch
     * @param numero dado por el usuario
     * @return
     */

    public static String mesSwitch(int numero){

        String mes = "Por determinar";

        switch(numero){
            case 1:
                return mes = "Enero";
            case 2:
                return mes ="Febrero";
            case 3:
                return mes ="Marzo";
            case 4:
                return mes ="Abril";
            case 5:
                return mes = "Mayo";
            case 6:
                return mes = "Junio";
            case 7:
                return mes = "Julio";
            case 8:
                return mes = "Agosto";
            case 9:
                return mes = "Septiembre";
            case 10:
                return mes = "Octubre";
            case 11:
                return mes = "Noviembre";
            case 12:
                return mes = "Diciembre";
            default:
                return mes;
        }
    }
}
