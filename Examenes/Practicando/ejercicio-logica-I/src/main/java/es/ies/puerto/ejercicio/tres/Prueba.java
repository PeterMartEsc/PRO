package es.ies.puerto.ejercicio.tres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prueba {

    public static void main(String[] args) throws ParseException {

        String fecha1 = "2017-03-03";
        String fecha2 = "2023-06-12";


        float diferenciaFinal = calcularDiferencia(fecha1, fecha2) * (24 * 60 * 60 * 1000L);

        System.out.println("El tiempo transcurrido entre las dos fechas es de " +diferenciaFinal);
    }

    public static float calcularDiferencia (String fecha1, String fecha2) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("aaaa-MM-dd");

        Date fechaFormato1 = formato.parse(fecha1);
        Date fechaFormato2 = formato.parse(fecha2);


        long diferencia = ((fechaFormato2.getTime() - fechaFormato1.getTime()) / 24 * 60 * 60 * 1000L);

        return (float) diferencia;
    }
}
