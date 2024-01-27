package ies.puerto.SegundaParte.impl;

import java.util.List;

public class Colegio {

    private String nombre;

    private String direccion;

    private String ubicacion;

    private List<Aula> aulas;

    public Colegio(){}

    public Colegio(String nombre, String direccion, String ubicacion, List<Aula> aulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.aulas = aulas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
}
