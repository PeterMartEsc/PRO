package ies.puerto.SegundaParte.impl;

import java.util.Objects;

public class Nota {

    private String nombre;

    private int valor;

    public Nota(){}

    public Nota(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return Objects.equals(nombre, nota.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
