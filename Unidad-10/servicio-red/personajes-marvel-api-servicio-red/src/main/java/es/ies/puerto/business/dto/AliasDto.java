package es.ies.puerto.business.dto;

import java.util.Objects;

public class AliasDto {
    String id;
    String descripcion;

    public AliasDto() {

    }

    public AliasDto(String id) {
        this.id = id;
    }

    public AliasDto(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        AliasDto aliasDto = (AliasDto) o;
        return Objects.equals(id, aliasDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AliasDto{" +
                "id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
