package es.ies.puerto.examen.logica.tres;

import java.util.Calendar;
import java.util.Date;

public class Viernes13 {
    public boolean esElFinDelMundo(Date fecha) {

        int dia = fecha.getDay();

        if(dia == 13){
            return true;
        }

        return false;
    }


}
