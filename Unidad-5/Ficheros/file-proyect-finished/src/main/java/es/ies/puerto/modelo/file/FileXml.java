package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;

import java.util.List;

public class FileXml extends UtilidadesClass implements ICrudOperaciones {

    @Override
    public List<Persona> obtenerPersonas() {
        return null;
    }

    @Override
    public Persona obtenerPersona(Persona persona) {
        return null;
    }

    @Override
    public void addPersona(Persona persona) {

    }

    @Override
    public void deletePersona(Persona persona) {

    }

    @Override
    public void updatePersona(Persona persona) {

    }
}
