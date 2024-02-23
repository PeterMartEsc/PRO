package ies.puerto.App.Persona;

import ies.puerto.impl.Persona.Persona;

import java.util.ArrayList;
import java.util.List;

public class AppPersona {

    static Persona rocky;

    static Persona adonis;

    static String dni1 = "12345678T";

    static String dni2 = "12345678H";

    static List<Persona> personas;

    public static void main(String[] args) {

        rocky = new Persona(dni1, "Rocky", "Balboa", "Stallone");
        adonis = new Persona(dni2, "Adonis", "Apolo", "Creed");

        personas = new ArrayList<>();
        personas.add(rocky);
        personas.add(adonis);
        System.out.println(personas);

        Persona rocky2 = new Persona(dni1, "Rocky", "Balboa", "Stallone");

        if(personas.contains(rocky2)) {
            System.out.println("La lista contiene a " +rocky);
        }
    }
}
