package es.ies.puerto.file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.impl.SuperHeroe;
import es.ies.puerto.interfaces.ICrudOperations;
import es.ies.puerto.utilities.UtilidadesClass;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson extends UtilidadesClass implements ICrudOperations {

    List<SuperHeroe> superheroes;
    String path="src/main/resources/data.json";

    public FileJson(){

    }
    public FileJson(List<SuperHeroe> superheroes) {
        this.superheroes = new ArrayList<>();
    }

    @Override
    public List<SuperHeroe> obtenerSuperHeroes() {

        try {

            String json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<List<SuperHeroe>>() {}.getType();
            superheroes = new Gson().fromJson(json, listType);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return superheroes;
    }

    @Override
    public SuperHeroe obtenerSuperHeroe(SuperHeroe superHeroe) {

        if (!superheroes.contains(superHeroe)){
            return null;
        }

        int posicion = superheroes.indexOf(superHeroe);
        return superheroes.get(posicion);
    }

    @Override
    public void addHeroe(SuperHeroe superHeroe) {
        if(superheroes.contains(superHeroe)){
            return;
        }

        superheroes.add(superHeroe);
        actualizarFichero(superheroes);
    }

    @Override
    public void deleteHeroe(SuperHeroe superHeroe) {
        if (superheroes.remove(superHeroe)) {
            actualizarFichero(superheroes);
        }
    }

    @Override
    public void updateHeroe(SuperHeroe superHeroe) {
        if(!superheroes.contains(superHeroe)){
            return;
        }

        int posicion = superheroes.indexOf(superHeroe);
        superheroes.set(posicion, superHeroe);
    }

    public void actualizarFichero(List<SuperHeroe> personajes){

        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personajes, writer);
        } catch (IOException e) {
            System.err.println("Error while saving data: " + e.getMessage());
        }
    }
}
