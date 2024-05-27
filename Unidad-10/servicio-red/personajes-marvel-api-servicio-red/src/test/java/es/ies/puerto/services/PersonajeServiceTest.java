package es.ies.puerto.services;

import es.ies.puerto.business.dto.PersonajeDto;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.exception.MarvelException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PersonajeServiceTest {

    PersonajeService personajeService;

    @Mock
    DaoPersonaje daoPersonaje;

    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        personajeService = new PersonajeService();
        personajeService.setDaoPersonaje(daoPersonaje);
    }

    @Test
    void getAllPersonajesTest() throws MarvelException {
        when(daoPersonaje.findAllPersonaje()).thenReturn(new HashSet<>());
        Response respuesta = personajeService.getAllPersonajes();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOnePersonajeOkTest() throws MarvelException {
        when(daoPersonaje.findPersonaje(any(Personaje.class))).thenReturn(new Personaje());
        Response respuesta = personajeService.getPersonajeById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOnePersonajeNotFoundTest() throws MarvelException {
        when(daoPersonaje.findPersonaje(any(Personaje.class))).thenReturn(null);
        Response respuesta = personajeService.getPersonajeById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }

    @Test
    void createPersonajeNotFoundOkTest() throws MarvelException {
        when(daoPersonaje.updatePersonaje(any(Personaje.class))).thenReturn(false);
        Response respuesta = personajeService.updatePersonaje(new PersonajeDto());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus());
    }

    @Test
    void updatePersonajeFoundOkTest() throws MarvelException {
        when(daoPersonaje.updatePersonaje(any(Personaje.class))).thenReturn(true);
        Response respuesta = personajeService.updatePersonaje(new PersonajeDto());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void deleteOnePersonajeOkTest() throws MarvelException {
        when(daoPersonaje.deletePersonaje(any(Personaje.class))).thenReturn(true);
        Response respuesta = personajeService.deletePersonajeById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus());
    }

    @Test
    void deleteOnePersonajeErrorTest() throws MarvelException {
        when(daoPersonaje.deletePersonaje(any(Personaje.class))).thenReturn(false);
        Response respuesta = personajeService.deletePersonajeById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
}
