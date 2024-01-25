package ies.puerto.PrimeraParte.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    private String identificador;
    private List<Alumno> alumnos;

    public Aula(String identificador) {
        this.identificador = identificador;
        this.alumnos = new ArrayList<>();
    }

    public Aula(String identificador, List<Alumno> alumnos) {
        this.identificador = identificador;
        this.alumnos = alumnos;
    }

    public float media() {
        float resultado = 0f;

        if(alumnos.isEmpty()){
            return resultado;
        }

        for(Alumno alumno:alumnos){
            resultado += alumno.media();
        }

        return resultado/ alumnos.size();
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
