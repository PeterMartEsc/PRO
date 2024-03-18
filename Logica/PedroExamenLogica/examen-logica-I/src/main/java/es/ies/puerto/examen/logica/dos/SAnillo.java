package es.ies.puerto.examen.logica.dos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SAnillo {
    final String expresionRegular = "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
    private final String fechaEstreno = "17/12/2003";
    Date dFechaEstreno = null;
    private final String formatDate = "dd/MM/yyyy";
    SimpleDateFormat dateFormat;

    public SAnillo() {

        dateFormat = new SimpleDateFormat(formatDate);


        try {
            dFechaEstreno = dateFormat.parse(fechaEstreno);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public long obtenerDiasDesdeRetornoRey(String fecha) {

        if(fecha == null){
            return -1;
        }

        try {
            Date dFechaActual = dateFormat.parse(fecha);

            long diferencia = ((dFechaActual.getTime()-dFechaEstreno.getTime())/(24*60*60*1000));

            return diferencia;

        } catch (ParseException e) {
            return -1;
        }
    }
}
