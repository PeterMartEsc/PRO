package es.ies.puerto.file.cuatro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static utilidades.UtilClassTest.MESSAGE_ERROR;

public class FilePokedexXmlTest {


    FilePokedexXml persistencia;
    List<Pokemon> pokemons;

    @BeforeEach
    public void beforeEach() {
        persistencia = new FilePokedexXml();
        pokemons = persistencia.obtenerPokemons();
    }

    @Test
    public void obtenerPokemosTest() {
        Assertions.assertFalse(pokemons.isEmpty(),
                MESSAGE_ERROR);
        Assertions.assertEquals(5, pokemons.size(),
                MESSAGE_ERROR);
    }

    @Test
    public void obtenerPokemonTest() {
        String idBuscar = "001";
        Pokemon PokemonBuscar = new Pokemon(idBuscar);
        PokemonBuscar = persistencia.obtenerPokemon(PokemonBuscar);
        Assertions.assertEquals(PokemonBuscar.getId(),idBuscar,
                MESSAGE_ERROR);
        Assertions.assertNotNull(PokemonBuscar.getNombre(),
                MESSAGE_ERROR);
        Assertions.assertTrue (PokemonBuscar.getNombre().equals("Bulbasaur"),
                MESSAGE_ERROR);
        Assertions.assertNotNull(PokemonBuscar.getDescripcion().equals("Un pequeño Pokémon con una semilla en su espalda que crece a medida que el Pokémon se desarrolla."),
                MESSAGE_ERROR);
    }

    @Test
    public void addDeletePokemonTest() {

        int numPokemonsInicial = pokemons.size();

        List<String> tipos = new ArrayList<>();
        tipos.add("Fuego");
        tipos.add("Lucha");
        Pokemon PokemonInsertar = new Pokemon("006", "Monferno", tipos, "Es un mono con aspecto rabioso.");

        persistencia.addPokemon(PokemonInsertar);
        pokemons = persistencia.obtenerPokemons();
        int numPokemonsInsertar = pokemons.size();
        Assertions.assertTrue(pokemons.contains(PokemonInsertar),
                MESSAGE_ERROR);
        Assertions.assertEquals(numPokemonsInicial +1 ,
                numPokemonsInsertar, MESSAGE_ERROR);

        persistencia.deletePokemon(PokemonInsertar);
        pokemons = persistencia.obtenerPokemons();
        int numPokemonsBorrado = pokemons.size();

        Assertions.assertEquals(numPokemonsInicial ,
                numPokemonsBorrado,
                MESSAGE_ERROR);
    }

    @Test
    public void actualizarPokemon() {
        String idActualizar = "002";
        Pokemon PokemonBuscar = new Pokemon(idActualizar);
        Pokemon PokemonActualizar = persistencia.obtenerPokemon(PokemonBuscar);
        Pokemon PokemonBackup = persistencia.obtenerPokemon(PokemonBuscar);
        PokemonActualizar.setNombre("Charizard");
        PokemonActualizar.setDescripcion("Un dragon muy grande que no deja de escupir fuego");
        persistencia.updatePokemon(PokemonActualizar);

        PokemonBuscar = persistencia.obtenerPokemon(PokemonBuscar);
        Assertions.assertEquals(PokemonBuscar.toString(), PokemonActualizar.toString(),
                MESSAGE_ERROR);
        persistencia.updatePokemon(PokemonBackup);

    }


}
