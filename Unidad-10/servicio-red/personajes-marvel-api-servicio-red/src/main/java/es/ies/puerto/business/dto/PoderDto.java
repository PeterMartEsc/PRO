package es.ies.puerto.business.dto;

import java.util.Objects;

public class PoderDto {
    String id;
    String nombre;

    public PoderDto() {
    }

    public PoderDto(String id) {
        this.id = id;
    }

    public PoderDto(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoderDto poderDto = (PoderDto) o;
        return Objects.equals(id, poderDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PoderDto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
