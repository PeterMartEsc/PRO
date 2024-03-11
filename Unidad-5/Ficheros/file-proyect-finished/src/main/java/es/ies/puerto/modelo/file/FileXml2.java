package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.PersonaList;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.core.Persist;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml2 implements ICrudOperaciones {

    private FileXml2(){
        personas = new ArrayList<>();
    }

    @Element(name="persona")
    List<Persona> personas;
    String path="src/main/resources/data.csv";
    @Override
    public List<Persona> obtenerPersonas() {
        return personas;
    }

    @Override
    public Persona obtenerPersona(Persona persona) {

        if(personas.contains(persona)){
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

        actualizarFichero(personas);
    }

    private void actualizarFichero(List<Persona> personas){
        PersonaList personaList = new PersonaList();
        Persister serializer = new Persister();
        try{
            serializer.write(personaList, new File(path));
        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
