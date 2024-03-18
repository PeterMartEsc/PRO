package es.ies.puerto.examen.logica.dos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public long obtenerDiasDesdeRetornoRey(String fecha)  {
        long resultado = -1;
        if (fecha == null || !auxiliarRegexp(fecha)){
            return resultado;
        }
        Date dFechaUsuario = null;
        try {
            dFechaUsuario = dateFormat.parse(fecha);
            dFechaEstreno = dateFormat.parse(fechaEstreno);
        }catch (Exception exception) {

        }

        long diferenciaDias = dFechaUsuario.getTime() - dFechaEstreno.getTime();
        long diferenciaMili = 24*60*60*1000L;
        resultado = diferenciaDias/diferenciaMili;

        return Math.abs(resultado);
    }
    public boolean auxiliarRegexp (String fecha){
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();

    }
}
