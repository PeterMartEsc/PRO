package ies.puerto.PrimeraParte.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno {

    private String nombre;

    private String apellidos;

    private List<Float> calificaciones;

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificaciones = new ArrayList<>();
    }

    public Alumno(String nombre, String apellidos, List<Float> listaCalificaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificaciones = listaCalificaciones;
    }

    public float media(){

        float resultado = 0f;

        if(calificaciones.isEmpty()){
            return resultado;
        }

        for (float calificacion : calificaciones){
            resultado+= calificacion;
        }

        return resultado/ calificaciones.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Float> getListaCalificaciones() {
        return calificaciones;
    }

    public void setListaCalificaciones(List<Float> listaCalificaciones) {
        this.calificaciones = listaCalificaciones;
    }
}
