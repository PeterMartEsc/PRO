package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.UtilidadesClass;

import java.util.Objects;

public class Persona extends UtilidadesClass {
    int id;
    String nombre;
    int edad;
    String email;

    public Persona (int id) {
        this.id= id;
    }

    public Persona(int id, String nombre, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toCsv() {
        return id + DELIMITADOR + nombre
                + DELIMITADOR + edad + DELIMITADOR + email;
    }
}
