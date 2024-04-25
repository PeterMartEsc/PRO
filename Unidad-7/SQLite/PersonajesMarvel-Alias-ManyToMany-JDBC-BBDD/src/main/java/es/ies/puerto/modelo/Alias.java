package es.ies.puerto.modelo;

import java.util.Objects;

public class Alias {

    private String id;

    private String idSuperheroe;
    private String alias;

    public Alias(String id) {
        this.id = id;
    }

    public Alias(String id, String idSuperheroe, String alias) {
        this.id = id;
        this.idSuperheroe = idSuperheroe;
        this.alias = alias;
    }

    public String getId() {
        return id;
    }

    public String getIdSuperheroe() {
        return idSuperheroe;
    }

    public void setIdSuperheroe(String idSuperheroe) {
        this.idSuperheroe = idSuperheroe;
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
