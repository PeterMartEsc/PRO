package es.ies.puerto.modelo;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "personas")
public class PersonaList {

    @ElementList(inline = true)
    private List<Persona> personas;


    public PersonaList() {
    }
    public PersonaList(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
