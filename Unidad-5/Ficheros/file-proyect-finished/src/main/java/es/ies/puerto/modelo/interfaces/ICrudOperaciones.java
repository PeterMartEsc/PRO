package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.Persona;

import java.util.List;

public interface ICrudOperaciones {

    public List<Persona> obtenerPersonas();

    public Persona obtenerPersona(Persona persona);

    public void addPersona(Persona persona);

    public void deletePersona(Persona persona);

    public void updatePersona(Persona persona);

    }
