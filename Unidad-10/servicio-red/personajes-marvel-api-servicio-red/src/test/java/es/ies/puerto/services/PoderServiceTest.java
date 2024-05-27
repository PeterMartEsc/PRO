package es.ies.puerto.services;


import es.ies.puerto.business.dto.PoderDto;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
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

public class PoderServiceTest {

    PoderService poderService;

    @Mock
    DaoPoder daoPoder;

    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        poderService = new PoderService();
        poderService.setDaoPoder(daoPoder);
    }

    @Test
    void getAllPoderesTest() throws MarvelException {
        when(daoPoder.findAllPoder()).thenReturn(new HashSet<>());
        Response respuesta = poderService.getAllPoderes();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOnePodereOkTest() throws MarvelException {
        when(daoPoder.findPoder(any(Poder.class))).thenReturn(new Poder());
        Response respuesta = poderService.getPoderesById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOnePodereNotFoundTest() throws MarvelException {
        when(daoPoder.findPoder(any(Poder.class))).thenReturn(null);
        Response respuesta = poderService.getPoderesById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }

    @Test
    void createPodereNotFoundOkTest() throws MarvelException {
        when(daoPoder.updatePoder(any(Poder.class))).thenReturn(false);
        Response respuesta = poderService.updatePoder(new PoderDto());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus());
    }

    @Test
    void updatePodereFoundOkTest() throws MarvelException {
        when(daoPoder.updatePoder(any(Poder.class))).thenReturn(true);
        Response respuesta = poderService.updatePoder(new PoderDto());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void deleteOnePodereOkTest() throws MarvelException {
        when(daoPoder.deletePoder(any(Poder.class))).thenReturn(true);
        Response respuesta = poderService.deletePoderById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus());
    }

    @Test
    void deleteOnePodereErrorTest() throws MarvelException {
        when(daoPoder.deletePoder(any(Poder.class))).thenReturn(false);
        Response respuesta = poderService.deletePoderById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
}
