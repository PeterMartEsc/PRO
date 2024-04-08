package es.ies.puerto.modelo;

import java.util.List;
import java.util.Objects;

public class Superheroe {

    private String nombre;

    private String alias;

    private String genero;

    private List<String> poderes;

    public Superheroe(String alias) {
        this.alias = alias;
    }

    public Superheroe(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Superheroe that = (Superheroe) o;
        return Objects.equals(alias, that.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

    @Override
    public String toString() {
        return "Superheroe{" +
                "nombre='" + nombre + '\n' +
                ", alias='" + alias + '\n' +
                ", genero='" + genero + '\n' +
                ", poderes=" + poderes +
                '}';
    }
}
