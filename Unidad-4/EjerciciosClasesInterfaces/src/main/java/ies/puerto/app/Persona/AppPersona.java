package ies.puerto.app.Persona;

import ies.puerto.impl.Persona.Alumno;
import ies.puerto.impl.Persona.Profesor;

import java.text.ParseException;

public class AppPersona {

    static Profesor profesor;
    static Alumno alumno;

    public static void main(String[] args) throws ParseException {
        profesor = new Profesor("Rocky Balboa", "06-07-1946", 2400.41f, "Boxeo");
        System.out.println(profesor.toString());
        System.out.println("Su edad es: " +profesor.calcularEdad());
        System.out.println(profesor.impartirClase());

        System.out.println();

        alumno = new Alumno("Apolo Creed", "21-03-2004", "Avanzado");
        System.out.println(alumno.toString());
        System.out.println("Su edad es: " +alumno.calcularEdad());
        System.out.println(alumno.estudiar());
    }
}
