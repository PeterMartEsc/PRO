package ies.puerto.PrimeraParte.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppAula {
    static Aula dam1;

    public static void main(String[] args) {

        dam1 = new Aula("1 DAM");

        Alumno alumno1 = new Alumno("Pedro", "Martín Escuela", Arrays.asList(9f, 5f, 7f, 8f));
        Alumno alumno2 = new Alumno("Rocky", "Balboa", Arrays.asList(10f, 7f, 3f, 5f));
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);

        dam1.setAlumnos(alumnos);

        System.out.println("Media Aula: " +dam1.media());
    }



}
