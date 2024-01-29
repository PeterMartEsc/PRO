package ies.puerto.SegundaParte.impl;

import ies.puerto.SegundaParte.abstrac.PersonaAbstract;

import java.util.List;
import java.util.Objects;

public class Alumno extends PersonaAbstract {

    private List<Nota> notas;

    //Cuando se inicia como ArayList?

    public Alumno(String nombre, int dni, String fechaNacimiento, List<Nota> notas) {
        super(nombre, dni, fechaNacimiento);
        this.notas = notas;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(notas, alumno.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notas);
    }
}
