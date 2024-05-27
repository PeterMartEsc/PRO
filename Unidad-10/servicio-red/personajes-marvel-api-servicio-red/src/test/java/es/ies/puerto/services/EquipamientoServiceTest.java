package es.ies.puerto.services;


import es.ies.puerto.business.dto.EquipamientoDto;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
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

public class EquipamientoServiceTest {

    EquipamientoService equipamientoService;

    @Mock
    DaoEquipamiento daoEquipamiento;

    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        equipamientoService = new EquipamientoService();
        equipamientoService.setDaoEquipamiento(daoEquipamiento);
    }

    @Test
    void getAllEquipamientosTest() throws MarvelException {
        when(daoEquipamiento.findAllEquipamiento()).thenReturn(new HashSet<>());
        Response respuesta = equipamientoService.getAllEquipamientos();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneEquipamientoOkTest() throws MarvelException {
        when(daoEquipamiento.findEquipamiento(any(Equipamiento.class))).thenReturn(new Equipamiento());
        Response respuesta = equipamientoService.getEquipamientoById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneEquipamientoNotFoundTest() throws MarvelException {
        when(daoEquipamiento.findEquipamiento(any(Equipamiento.class))).thenReturn(null);
        Response respuesta = equipamientoService.getEquipamientoById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }

    @Test
    void createEquipamientoNotFoundOkTest() throws MarvelException {
        when(daoEquipamiento.updateEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response respuesta = equipamientoService.updateEquipamiento(new EquipamientoDto());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus());
    }

    @Test
    void updateEquipamientoFoundOkTest() throws MarvelException {
        when(daoEquipamiento.updateEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response respuesta = equipamientoService.updateEquipamiento(new EquipamientoDto());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void deleteOneEquipamientoOkTest() throws MarvelException {
        when(daoEquipamiento.deleteEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response respuesta = equipamientoService.deleteEquipamientoById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus());
    }

    @Test
    void deleteOneEquipamientoErrorTest() throws MarvelException {
        when(daoEquipamiento.deleteEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response respuesta = equipamientoService.deleteEquipamientoById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
}
