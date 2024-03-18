package es.ies.puerto.impl;

import es.ies.puerto.utilities.UtilidadesClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SuperHeroe extends UtilidadesClass {

    private String alias;

    private String nombre;

    private String genero;

    private List<Poder> poderes;

    public SuperHeroe(){

    }

    public SuperHeroe(String alias) {
        this.alias = alias;
        this.poderes = new ArrayList<>();
    }

    public SuperHeroe(String nombre, String alias, String genero, List<Poder> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlias() {
        return alias;
    }

    public String getGenero() {
        return genero;
    }

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHeroe superHeroe = (SuperHeroe) o;
        return Objects.equals(alias, superHeroe.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes +
                '}';
    }

    public String toCsv() {
        return alias + DELIMITADOR + nombre
                + DELIMITADOR + genero + DELIMITADOR + DELIMITADOR2 + poderes;
    }
}
