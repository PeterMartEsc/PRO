package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Evento {

    private String nombre;
    private String fecha;

    public Evento (){

    }

    public Evento(String nombre) {
        this.nombre = nombre;
        calcularFecha();
    }

    public Evento(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    private void calcularFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();

        Date fechaActual = calendario.getTime();

        this.fecha = sdf.format(fecha);
    }

    public String informacion() {

        //El \n es como un "enter"
        return "Evento: " + nombre + "\nFecha: " + fecha + "\n";
    }


}
