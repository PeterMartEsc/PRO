package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileCsvTest {

    FileCsv fileCsv;
    List<Persona> personas;

    @BeforeEach
    public void beforeEach(){
        fileCsv = new FileCsv();
        personas = fileCsv.obtenerPersonas();
    }

    @Test
    public void obtenerPersonasTest(){
        //Sería lo mismo poner personas.size() > 0
        Assertions.assertFalse(personas.isEmpty(), "No se ha obtenido el valor");
    }

    @Test
    public void obtenerPersonaTest(){
        Persona personaBuscar = new Persona(2);
        personaBuscar = fileCsv.obtenerPersona(personaBuscar);
        Assertions.assertEquals(personaBuscar.getId(), 2,
                "No se ha obtenido el valor");
        Assertions.assertNotNull(personaBuscar.getNombre(),
                "No se ha obtenido el valor");
        //El int ya está iniciado por defecto, por lo que nunca t va a dar que es nulo
        Assertions.assertTrue(personaBuscar.getEdad() > 0,
                "No se ha obtenido el valor");
        Assertions.assertNotNull(personaBuscar.getEmail(),
                "No se ha obtenido el valor");
    }

    @Test
    public void aniadirPersonaTest(){
        String nombreInsertar = "otro";
        int edadInsertar = 99;
        String emailInsertar = "otro@email";
        int numPersonas = personas.size();
        Persona personaInsertar = new Persona(5, nombreInsertar,
                edadInsertar, emailInsertar);
        fileCsv.aniadirPersona(personaInsertar);
        personas = fileCsv.obtenerPersonas();
        int numPersonasInsertar = personas.size();
        Assertions.assertTrue(personas.contains(personaInsertar), "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonas+1, numPersonasInsertar, "No se ha obtenido el numero esperado");
    }
}
