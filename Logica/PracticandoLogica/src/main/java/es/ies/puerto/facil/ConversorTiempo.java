package es.ies.puerto.facil;

import java.util.Scanner;

public class ConversorTiempo {

    public void ConversorTiempoMain(int dias, int horas, int min, int seg) {

        float milisegundos= transformarDias(dias) + transformarHoras(horas) +
                transformarMinutos(min) + transformarSegundos(seg);

        System.out.println("Los datos introducidos equivalen a " +milisegundos+ " milisegundos");
    }

    public static float transformarDias(int dias){

        return (float) (dias * 24 * 60 * 60 * 1000);
    }

    public static float transformarHoras(int horas){

        return (float) (horas * 60 * 60 * 1000);
    }

    public static float transformarMinutos(int min){

        return (float) (min * 60 * 1000);
    }

    public static float transformarSegundos(int seg){

        return (float) (seg * 1000);
    }
}
