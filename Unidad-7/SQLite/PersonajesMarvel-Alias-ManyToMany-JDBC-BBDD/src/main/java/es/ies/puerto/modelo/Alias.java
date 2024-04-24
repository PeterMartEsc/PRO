package es.ies.puerto.modelo;

import java.util.Objects;

public class Alias {

    private String id;

    private String alias;

    public Alias(String id) {
        this.id = id;
    }

    public Alias(String id, String alias) {
        this.id = id;
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return Objects.equals(id, alias.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Alias{" +
                "id='" + id + '\n' +
                ", alias='" + alias + '\n' +
                '}';
    }
}
