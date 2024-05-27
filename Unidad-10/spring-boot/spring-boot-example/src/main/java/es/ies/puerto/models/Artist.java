package es.ies.puerto.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Artist {

    private String id;

    private String nombre;

    private List<Song> songs;

    public Artist() {
        songs = new ArrayList<>();
    }

    public Artist(String id) {
        this.id = id;
        songs = new ArrayList<>();
    }

    public Artist(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        songs = new ArrayList<>();
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

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(id, artist.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
