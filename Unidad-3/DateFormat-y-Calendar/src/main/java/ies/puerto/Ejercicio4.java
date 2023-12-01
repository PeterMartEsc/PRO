package ies.puerto;

import java.util.Calendar;

public class Ejercicio4 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE)+10);
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1; // Sumar 1 ya que los meses comienzan desde 0
        int dia = calendar.get(Calendar.DATE);

        System.out.println("Fecha dentro de 10 días: " + dia + "-" + mes + "-" + anio);

    }
}
