package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileXmlTest {
    String nombreInsertar = "otro";
    int edadInsertar = 99;
    String emailInsertar = "otro@email";

    ICrudOperaciones persistencia;

    List<Persona> personas;

    @BeforeEach
    public void beforeEach() {
        persistencia = new FileXml();
        personas = persistencia.obtenerPersonas();
    }

    @Test
    public void obtenerPersonasTest() {
        Assertions.assertFalse(personas.isEmpty(),
                "No se ha obtenido el valor esperado");
    }


    @Test
    public void obtenerPersonaTest() {
        Persona personaBuscar = new Persona(2);
        personaBuscar = persistencia.obtenerPersona(personaBuscar);
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
        persistencia.addPersona(personaInsertar);
        personas = persistencia.obtenerPersonas();

        int numPersonasInsertar = personas.size();

        Assertions.assertTrue(personas.contains(personaInsertar),
                "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonasInicial +1 ,
                numPersonasInsertar,
                "No se ha obtenido el numero esperado");

        persistencia.deletePersona(personaInsertar);
        personas = persistencia.obtenerPersonas();

        int numPersonasBorrado = personas.size();

        Assertions.assertEquals(numPersonasInicial ,
                numPersonasBorrado,
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void actualizarPersonaTest() {
        int idActualizar = 2;
        Persona personaBuscar = new Persona(idActualizar);
        Persona personaActualizar = persistencia.obtenerPersona(personaBuscar);
        Persona personaBackup = persistencia.obtenerPersona(personaBuscar);
        personaActualizar.setNombre(nombreInsertar);
        personaActualizar.setEdad(edadInsertar);
        personaActualizar.setEmail(emailInsertar);
        persistencia.updatePersona(personaActualizar);

        personaBuscar = persistencia.obtenerPersona(personaBuscar);
        Assertions.assertEquals(personaBuscar.toString(), personaActualizar.toString(),
                "Los datos actualizados no son los esperados");
        persistencia.updatePersona(personaBackup);
    }
}
