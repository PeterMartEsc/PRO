package ies.puerto;


import java.util.Calendar;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Necesario, instancia
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)-2);

        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1; //Meses comienzan desde 0
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Fecha hace dos meses: " +dia+ "-" +mes+ "-" +anio);
    }

}