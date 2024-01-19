package ies.puerto.impl.Persona;

import ies.puerto.abstrac.Persona.PersonaAbstract;

public class Alumno extends PersonaAbstract {

    private String nivel;

    public Alumno(String nombre, String fechaNacimiento, String nivel) {
        super(nombre, fechaNacimiento);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String estudiar(){

        return "El alumno está estudiando";
    }

    @Override
    public String toString() {
        return "Nombre: " +nombre+ "\nFecha de nacimiento: " +fechaNacimiento+ "\nNivel: " +nivel;
    }
}
