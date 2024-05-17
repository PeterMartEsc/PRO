package es.ies.puerto.dto;

import java.util.Objects;

public class EquipamientoDto {
    String id;
    String nombre;
    String descripcion;
    String personaje_id;

    public EquipamientoDto() {
    }

    public EquipamientoDto(String id) {
        this.id = id;
    }

    public EquipamientoDto(String id, String nombre, String descripcion, String personaje_id) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personaje_id = personaje_id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersonaje_id() {
        return personaje_id;
    }

    public void setPersonaje_id(String personaje_id) {
        this.personaje_id = personaje_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipamientoDto that = (EquipamientoDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "EquipamientoDto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", personaje_id='" + personaje_id + '\'' +
                '}';
    }
}
