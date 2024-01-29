package ies.puerto.SegundaParte.impl;

import java.util.List;
import java.util.Objects;

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

    public float notaMaxima(List<Nota> notas){

        float notaMax = 0;

        for (Nota elemento : notas){
            if(elemento.getValor() > notaMax){
                notaMax = elemento.getValor();
            }
        }

        return notaMax;
    }

    //Falta media del colegio, no se hacerla

    //Falta media salario y lo mismo con el máximo y minimo. Como cojo el salario de varios profesores?
    // Creo una lsta de profesores?

    //El resto de métodos lo mismo, me bloqueé. Hace falta crear más listas al margen de las especificadas?


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colegio colegio = (Colegio) o;
        return Objects.equals(aulas, colegio.aulas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aulas);
    }
}
