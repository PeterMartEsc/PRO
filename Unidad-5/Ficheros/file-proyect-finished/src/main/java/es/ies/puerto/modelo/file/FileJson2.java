package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;

import java.util.ArrayList;
import java.util.List;

public class FileJson2 implements ICrudOperaciones {

    List<Persona> personas;
    String path="src/main/resources/data.json";
    private FileJson2(){
        personas = new ArrayList<>();
    }
    @Override
    public List<Persona> obtenerPersonas() {
        return personas;
    }

    @Override
    public Persona obtenerPersona(Persona persona) {

        if(!personas.contains(persona)){
            return null;
        }

        int posicion = personas.indexOf(persona);
        return personas.get(posicion);
    }

    @Override
    public void addPersona(Persona persona) {
        if(personas.contains(persona)){
            return;
        }

        personas.add(persona);
    }

    @Override
    public void deletePersona(Persona persona) {

        if(!personas.contains(persona)){
            return;
        }

        personas.remove(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        if(!personas.contains(persona)){
            return;
        }

        int posicion = personas.indexOf(persona);
        personas.set(posicion, persona);
    }
}
