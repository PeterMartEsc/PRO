package es.ies.puerto.models;

import java.util.Objects;

public class Song {
    private String id;
    private String name;
    private String duration;

    public Song(String id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public Song() {
    }

    public Song(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
