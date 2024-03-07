package es.ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;

public class PersonaTest {

    int id = 1;
    String nombre = "nombre";
    int edad = 12;
    String email = "test@tet.com";

    Persona persona;

    @BeforeEach
    public void beforeEach() {
        persona = new Persona(id, nombre, edad, email);
    }

    @Test
    public void createPersonaTest() {
        Assertions.assertNotNull(persona, "El objeto no puede ser nulo");
    }

    @Test
    public void toStringPersonaTest() {
        Assertions.assertTrue(persona.toString().contains(String.valueOf(id)),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(nombre),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(String.valueOf(edad)),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(email),
                "El resultado no es el esperado");
    }


    @Test
    public void toCsvPersonaTest() {
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(id)),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(nombre),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(edad)),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(email),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(persona.DELIMITADOR),
                "El resultado no es el esperado");
    }

    @Test
    public void equalsPersonaTest() {
        Persona personaBuscar = new Persona(id);
        Assertions.assertEquals(personaBuscar, persona,
                "las personas deben de ser iguales");
    }

    @Test
    public void personaToXMLTest(){

        //Accion para escribir/leer en ficheros (serializar)
        Persister serializer = new Persister();
        try {
            //Escribir objeto (persona) en el fichero persona.xml (como no existe, lo crea en raiz)
            serializer.write(persona, new File("src/main/resources/persona.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void xmlToPersonaTest(){

        Persister serializer = new Persister();

        try {
            File file = new File("src/main/resources/persona.xml");
            Persona persona = serializer.read(Persona.class, file);

            Assertions.assertEquals(nombre, persona.getNombre(), "No se ha obtenido el valor esperado");
            Assertions.assertEquals(id, persona.getId(), "No se ha obtenido el valor esperado");
            Assertions.assertEquals(edad, persona.getEdad(), "No se ha obtenido el valor esperado");
            Assertions.assertEquals(email, persona.getEmail(), "No se ha obtenido el valor esperado");
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

}
