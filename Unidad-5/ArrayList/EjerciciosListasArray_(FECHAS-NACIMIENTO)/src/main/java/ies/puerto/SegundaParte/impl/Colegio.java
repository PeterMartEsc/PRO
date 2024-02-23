package ies.puerto.SegundaParte.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Colegio {

    private String nombre;

    private String direccion;

    private String ubicacion;

    private List<Aula> aulas;

    public Colegio(){}

    public Colegio(List<Aula> aulas) {
        this.aulas = new ArrayList<>();;
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

    public float mediaColegio(){
        float resultado=0f;

        if(aulas.isEmpty()){
            return resultado;
        }

        for(Aula aula : aulas){
            resultado+= aula.notaMediaAula();
        }

        return resultado/aulas.size();
    }

    //Falta media salario. Como cojo el salario de varios profesores?

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
