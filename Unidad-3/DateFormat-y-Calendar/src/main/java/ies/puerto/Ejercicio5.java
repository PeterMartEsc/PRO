package ies.puerto;


import java.util.Calendar;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Necesario, instancia
        Calendar calendar = Calendar.getInstance();

        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1; //Meses comienzan desde 0
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("La fecha actual es: " +dia+ "-" +mes+ "-" +anio);
        System.out.println("La fecha hace dos meses fué: ");
    }

}