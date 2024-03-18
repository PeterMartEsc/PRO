package es.ies.puerto.examen.logica.tres;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Viernes13 {

    public boolean esElFinDelMundo(Date fecha) {
        if (fecha == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        if (calendar.get(Calendar.DAY_OF_MONTH) != 13) {
            return false;
        }
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
    }

}
