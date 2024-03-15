package es.ies.puerto.modelo.file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.PersonaList;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson extends UtilidadesClass implements ICrudOperaciones {

    List<Persona> personas;

    String path="src/main/resources/data.json";

    public FileJson() {
        personas = new ArrayList<>();
    }

    @Override
    public List<Persona> obtenerPersonas() {
        try {
            String json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<ArrayList<Persona>>(){}.getType();
            personas = new Gson().fromJson(json, listType);
        } catch (IOException exception) {
            throw new RuntimeException(exception.getMessage());
        }
        return personas;
    }

    @Override
    public Persona obtenerPersona(Persona persona) {
        int posicion =  personas.indexOf(persona);
        if (posicion > 0 ) {
            return personas.get(posicion);
        }
        return null;
    }

    @Override
    public void addPersona(Persona persona) {
        if (personas.contains(persona)) {
            return;
        }
        personas.add(persona);
        guardarDatos(personas);
    }

    @Override
    public void deletePersona(Persona persona) {
        if (!personas.contains(persona)) {
            return;
        }
        personas.remove(persona);
        guardarDatos(personas);
    }

    @Override
    public void updatePersona(Persona persona) {
        if (!personas.contains(persona)) {
            return;
        }
        int posicion = personas.indexOf(persona);
        personas.set(posicion,persona);
        guardarDatos(personas);
    }

    private void guardarDatos(List<Persona> personas) {
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personas, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
