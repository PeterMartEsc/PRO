package ies.puerto.SegundaParte.impl;

import ies.puerto.SegundaParte.abstrac.PersonaAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno extends PersonaAbstract {

    private List<Nota> notas;

    public Alumno(){}


    public Alumno(int dni, List<Nota> notas) {
        super(dni);
        this.notas = new ArrayList<>();
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public float media(){

        float resultado=0f;

        if(notas.isEmpty()){
            return resultado;
        }

        for(Nota nota:notas){
            resultado+=nota.getValor();
        }

        resultado = resultado/notas.size();

        return resultado;
    }

    public float notaMaxima(){

        float resultado=0f;

        if(notas.isEmpty()){
            return resultado;
        }

        for(Nota nota:notas){
            if(nota.getValor() > resultado){
                resultado=nota.getValor();
            }
        }

        return resultado;
    }

    public float notaMinima(){

        float resultado=0f;

        if(notas.isEmpty()){
            return resultado;
        }

        resultado = notas.get(0).getValor();

        for(Nota nota:notas){
            if(nota.getValor() < resultado){
                resultado=nota.getValor();
            }
        }

        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(notas, alumno.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notas);
    }
}
