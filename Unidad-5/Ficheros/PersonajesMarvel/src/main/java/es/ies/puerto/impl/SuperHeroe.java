package es.ies.puerto.impl;

import es.ies.puerto.utilities.UtilidadesClass;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Root(name="personaje")
public class SuperHeroe extends UtilidadesClass {

    @Element(name="nombre")
    private String nombre;
    @Element(name="alias")
    private String alias;
    @Element(name="genero")
    private String genero;
    @ElementList(name="poderes", entry = "poder")
    private List<String> poderes;

    public SuperHeroe(){
        poderes = new ArrayList<>();
    }

    public SuperHeroe(String alias) {
        this.alias = alias;
        this.poderes = new ArrayList<>();
    }

    public SuperHeroe(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = new ArrayList<>();
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

    public List<String> getPoderes() {
        return poderes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPoderes(List<String> poderes) {
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
        String poderesString = String.join(", ", poderes);
        poderesString = poderesString.replace("\"", "");
        String resultado = alias + DELIMITADOR + nombre + DELIMITADOR + genero + DELIMITADOR + "\"" +poderesString + "\n";

        return resultado;
    }
}
