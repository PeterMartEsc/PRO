package ies.puerto.SegundaParte.abstrac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class PersonaAbstract {

    private String nombre;

    private int dni;

    private String fechaNacimiento;

    public PersonaAbstract(){}

    public PersonaAbstract(int dni) {
        this.dni = dni;
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

    @Override
    public String toString() {
        return "PersonaAbstract{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaAbstract that = (PersonaAbstract) o;
        return dni == that.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}