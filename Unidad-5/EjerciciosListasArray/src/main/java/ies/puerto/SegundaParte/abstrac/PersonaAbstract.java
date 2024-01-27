package ies.puerto.SegundaParte.abstrac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class PersonaAbstract {

    private String nombre;

    private int dni;

    private String fechaNacimiento;

    public PersonaAbstract(){}

    public PersonaAbstract(String nombre, int dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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
