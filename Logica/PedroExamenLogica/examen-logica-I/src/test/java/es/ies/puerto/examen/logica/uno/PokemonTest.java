package es.ies.puerto.examen.logica.uno;


import es.ies.puerto.examen.logica.utilidades.UtilClassTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PokemonTest extends UtilClassTest {
    static Pokemon pokemon;

    @BeforeAll
    public static void beforeAll() {
        pokemon = new Pokemon();
    }

    @Test
    public void pokemonErrorUnoTest(){
        float danio = pokemon.danio("Agua", "Agua", 110, 10);
        Assertions.assertEquals(-1f, danio, MESSAGE_ERROR);
    }

    @Test
    public void pokemonErrorDosTest(){
        float danio = pokemon.danio("Agua", "Agua", 10, 110);
        Assertions.assertEquals(-2f, danio, MESSAGE_ERROR);
    }

    @Test
    public void pokemonUnoTest(){
        float danio = pokemon.danio("Fuego", "Fuego", 50, 25);
        Assertions.assertEquals(50f, danio, MESSAGE_ERROR);
    }

    @Test
    public void pokemonDosTest(){
        float danio = pokemon.danio("Agua", "Agua", 100, 10);
        Assertions.assertEquals(250f, danio, MESSAGE_ERROR);
    }

    @Test
    public void pokemonTresTest(){
        float danio = pokemon.danio("Planta", "Fuego", 20, 10);
        Assertions.assertEquals(200f, danio, MESSAGE_ERROR);
    }
    @Test
    public void pokemonCuatroTest(){
        float danio = pokemon.danio("Planta", "Agua", 20, 40);
        Assertions.assertEquals(12.5f, danio, MESSAGE_ERROR);
    }
}
