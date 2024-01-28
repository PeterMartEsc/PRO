package ies.puerto.SegundaParte.impl;

import ies.puerto.SegundaParte.abstrac.EmpleadoAbstract;

public class Profesor extends EmpleadoAbstract {

    private String especialidad;

    public Profesor(String nombre, int dni, String fechaNacimiento, float salario, String especialidad) {
        super(nombre, dni, fechaNacimiento, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


}
