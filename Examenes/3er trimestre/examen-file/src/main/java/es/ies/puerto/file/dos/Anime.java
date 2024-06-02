package es.ies.puerto.file.dos;

import java.util.Objects;

public class Anime {
    private String id;
    private String nombre;
    private String serie;
    private String poderEspecial;
    private String descripcion;

    public Anime(){

    }

    public Anime(String id) {
        this.id = id;
    }

    public Anime(String id, String nombre, String serie, String poderEspecial, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.serie = serie;
        this.poderEspecial = poderEspecial;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getPoderEspecial() {
        return poderEspecial;
    }

    public void setPoderEspecial(String poderEspecial) {
        this.poderEspecial = poderEspecial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Objects.equals(id, anime.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", serie='" + serie + '\'' +
                ", poderEspecial='" + poderEspecial + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
