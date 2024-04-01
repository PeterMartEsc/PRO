package es.ies.puerto.file.dos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.file.tres.Arma;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileAnimeJson {

    List<Anime> animes;
    String path = "src/main/resources/dos.json";

    public List<Anime> obtenerAnimes() {

        try {
            String json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<List<Anime>>() {}.getType();
            animes = new Gson().fromJson(json, listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return animes;
    }
    public Anime obtenerAnime(Anime anime) {
        if(!animes.contains(anime)){
            return null;
        }

        int posicion = animes.indexOf(anime);
        return animes.get(posicion);
    }
    public void addAnime(Anime anime) {
        if(animes.contains(anime)){
            return;
        }
        animes.add(anime);
        actualizarFichero(animes);

    }
    public void deleteAnime(Anime anime) {
        if(animes.remove(anime)){
            actualizarFichero(animes);
        }
    }
    public void updateAnime(Anime anime) {
        if(!animes.contains(anime)){
            return;
        }
        int posicion = animes.indexOf(anime);
        animes.set(posicion, anime);
        actualizarFichero(animes);
    }

    public void actualizarFichero(List<Anime> animes){

        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(animes, writer);
        } catch (IOException e) {
            System.err.println("Error while saving data: " + e.getMessage());
        }
    }
}
