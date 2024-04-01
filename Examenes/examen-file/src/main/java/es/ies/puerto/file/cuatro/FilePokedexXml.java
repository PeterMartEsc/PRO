package es.ies.puerto.file.cuatro;

import es.ies.puerto.file.dos.Anime;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class FilePokedexXml {
    String path = "src/main/resources/cuatro.xml";
    List<Pokemon> pokemons;
    public List<Pokemon> obtenerPokemons() {

        Persister serializer = new Persister();
        try{
            File file = new File(path);
            Pokedex pokedex = serializer.read(Pokedex.class, file);
            pokemons = pokedex.getPokemons();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return pokemons;
    }
    public Pokemon obtenerPokemon(Pokemon pokemon) {
        if(!pokemons.contains(pokemon)){
            return null;
        }

        int posicion = pokemons.indexOf(pokemon);
        return pokemons.get(posicion);
    }
    public void addPokemon(Pokemon pokemon) {
        if(pokemons.contains(pokemon)){
            return;
        }
        pokemons.add(pokemon);
        actualizarFichero(pokemons);
    }
    public void deletePokemon(Pokemon pokemon) {
        if(pokemons.remove(pokemon)){
            actualizarFichero(pokemons);
        }
    }
    public void updatePokemon(Pokemon pokemon) {
        if(!pokemons.contains(pokemon)){
            return;
        }

        int posicion = pokemons.indexOf(pokemon);
        pokemons.set(posicion, pokemon);
        actualizarFichero(pokemons);
    }

    public void actualizarFichero(List<Pokemon> pokemons){
        Pokedex pokedex = new Pokedex(pokemons);
        Persister serializer = new Persister();
        try {
            serializer.write(pokedex, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
