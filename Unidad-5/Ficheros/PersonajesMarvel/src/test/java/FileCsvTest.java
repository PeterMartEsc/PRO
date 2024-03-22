import es.ies.puerto.file.FileJson;
import es.ies.puerto.impl.SuperHeroe;
import es.ies.puerto.interfaces.ICrudOperations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileCsvTest {

    String nombre = "Nombre nuevo";
    String alias = "alias nuevo";
    String genero = "genero nuevo";
    List<String> poderes;
    List<SuperHeroe> superHeroes;
    String error = "No se ha obtenido el resultado esperado";

    //Nombre por conveniencia
    ICrudOperations persistencia;

    @BeforeEach
    public void beforeEach () {
        persistencia = new FileJson();
        superHeroes = persistencia.obtenerSuperHeroes();
        poderes = new ArrayList<>(Arrays.asList("poder 1", "poder 2", "poder 3"));
    }

    @Test
    public void obtenerSuperheroesTest(){
        Assertions.assertNotNull(superHeroes, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void obtenerSuperheroeTest(){
        SuperHeroe superheroeObtener = new SuperHeroe("Tony Stark");
        superheroeObtener = persistencia.obtenerSuperHeroe(superheroeObtener);
        Assertions.assertEquals(superheroeObtener.getAlias(),"Tony Stark", error);
        Assertions.assertEquals(superheroeObtener.getNombre(), "Iron Man", error);
        Assertions.assertFalse(superheroeObtener.getPoderes().isEmpty(), error);
        Assertions.assertEquals(superheroeObtener.getGenero(), "Masculino", error);
    }

    @Test
    public void updateSuperheroeTest(){
        SuperHeroe superheroeModificar = new SuperHeroe("Peter Parker");

        SuperHeroe superheroeBackup = persistencia.obtenerSuperHeroe(superheroeModificar);

        superheroeModificar = persistencia.obtenerSuperHeroe(superheroeModificar);
        superheroeModificar.setNombre(nombre);
        superheroeModificar.setGenero(genero);
        superheroeModificar.setPoderes(poderes);

        persistencia.updateHeroe(superheroeModificar);

        Assertions.assertEquals(superheroeModificar,
                persistencia.obtenerSuperHeroe(superheroeModificar), error);

        persistencia.updateHeroe(superheroeBackup);
    }

    @Test
    public void addDeleteSuperheroeTest(){
        int tamanioOriginal = superHeroes.size();
        SuperHeroe superheroeAgregar = new SuperHeroe (alias, nombre, genero, poderes);
        persistencia.addHeroe(superheroeAgregar);
        superHeroes = persistencia.obtenerSuperHeroes();
        int tamanioNuevo = superHeroes.size();

        Assertions.assertTrue(superHeroes.contains(superheroeAgregar), error);
        Assertions.assertEquals(tamanioOriginal + 1, tamanioNuevo, error);

        persistencia.deleteHeroe(superheroeAgregar);
        Assertions.assertFalse(superHeroes.contains(superheroeAgregar), error);
    }
}
