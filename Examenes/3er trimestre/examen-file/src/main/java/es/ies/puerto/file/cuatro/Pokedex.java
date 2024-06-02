package es.ies.puerto.file.cuatro;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="pokedex")
public class Pokedex {

    @ElementList(inline = true)
    private List<Pokemon> pokemons;

    public Pokedex(){

    }
    public Pokedex(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
