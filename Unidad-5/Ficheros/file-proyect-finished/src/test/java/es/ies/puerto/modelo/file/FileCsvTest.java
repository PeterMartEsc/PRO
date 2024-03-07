package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileCsvTest {

    String nombreInsertar = "otro";
    int edadInsertar = 99;
    String emailInsertar = "otro@email";

    FileCsv fileCsv;
    List<Persona> personas;

    @BeforeEach
    public void beforeEach() {
        fileCsv = new FileCsv();
        personas = fileCsv.obtenerPersonas();
    }

    @Test
    public void obtenerPersonasTest() {
        Assertions.assertFalse(personas.isEmpty(),
                "No se ha obtenido el valor esperado");
    }


    @Test
    public void obtenerPersonaTest() {
        Persona personaBuscar = new Persona(2);
        personaBuscar = fileCsv.obtenerPersona(personaBuscar);
        Assertions.assertEquals(personaBuscar.getId(),2,
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personaBuscar.getNombre(),
                "No se ha obtenido el valor esperado");
        Assertions.assertTrue (personaBuscar.getEdad() > 0,
                "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personaBuscar.getEmail(),
                "No se ha obtenido el valor esperado");
    }

    @Test
    public void addDeletePersonaTest() {

        int numPersonasInicial = personas.size();
        Persona personaInsertar = new Persona(5, nombreInsertar,
                edadInsertar,emailInsertar);
        fileCsv.addPersona(personaInsertar);
        personas = fileCsv.obtenerPersonas();
        int numPersonasInsertar = personas.size();
        Assertions.assertTrue(personas.contains(personaInsertar),
                "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonasInicial +1 ,
                numPersonasInsertar,
                "No se ha obtenido el numero esperado");
        fileCsv.deletePersona(personaInsertar);
        personas = fileCsv.obtenerPersonas();
        int numPersonasBorrado = personas.size();
        Assertions.assertEquals(numPersonasInicial ,
                numPersonasBorrado,
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void actualizarPersona() {
        int idActualizar = 2;
        Persona personaBuscar = new Persona(idActualizar);
        Persona personaActualizar = fileCsv.obtenerPersona(personaBuscar);
        Persona personaBackup = fileCsv.obtenerPersona(personaBuscar);
        personaActualizar.setNombre(nombreInsertar);
        personaActualizar.setEdad(edadInsertar);
        personaActualizar.setEmail(emailInsertar);
        fileCsv.updatePersona(personaActualizar);

        personaBuscar = fileCsv.obtenerPersona(personaBuscar);
        Assertions.assertEquals(personaBuscar.toString(), personaActualizar.toString(),
                "Los datos actualizados no son los esperados");
        fileCsv.updatePersona(personaBackup);



    }
}
