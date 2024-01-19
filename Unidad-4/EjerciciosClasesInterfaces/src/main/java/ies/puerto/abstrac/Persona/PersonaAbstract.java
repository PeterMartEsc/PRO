package ies.puerto.abstrac.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class PersonaAbstract {

    public String nombre;
    public String fechaNacimiento;


    public PersonaAbstract() {
    }

    public PersonaAbstract(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad () throws ParseException {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Date nacimiento = formatoFecha.parse(fechaNacimiento);

        Date fechaActualSinFormato = new Date();
        Date fechaActual = formatoFecha.parse(formatoFecha.format(fechaActualSinFormato));

        long edad = ((fechaActual.getTime() - nacimiento.getTime()) / (1000L * 60 * 60 * 24 * 365));

        return Math.abs((int) edad);
    }

}