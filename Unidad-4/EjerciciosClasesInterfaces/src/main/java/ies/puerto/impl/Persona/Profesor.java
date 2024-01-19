package ies.puerto.impl.Persona;

import ies.puerto.abstrac.Persona.EmpleadoAbstract;

public class Profesor extends EmpleadoAbstract {

    private String especialidad;

    public Profesor(String nombre, String fechaNacimiento, float salario, String especialidad) {
        super(nombre, fechaNacimiento, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String impartirClase(){
        return "Hoy aprenderemos a boxear";
    }

    @Override
    public String toString() {
        return "Nombre: " +nombre+ "\nFecha de nacimiento: " +fechaNacimiento+ "\nEspecialidad: " +especialidad+ "\nSalario: "
                +getSalario();
    }
}
