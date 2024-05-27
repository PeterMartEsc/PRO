package es.ies.puerto.services;

import es.ies.puerto.business.dto.AliasDto;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
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

public class AliasServiceTest {

    AliasService aliasService;

    @Mock
    DaoAlias daoAliasMock;

    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        aliasService = new AliasService();
        aliasService.setDaoAlias(daoAliasMock);
    }

    @Test
    void getAllAliasTest() throws MarvelException {
        when(daoAliasMock.findAllAlias()).thenReturn(new HashSet<>());
        Response respuesta = aliasService.getAllAlias();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneAliasOkTest() throws MarvelException {
        when(daoAliasMock.findAlias(any(Alias.class))).thenReturn(new Alias());
        Response respuesta = aliasService.getAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneAliasNotFoundTest() throws MarvelException {
        when(daoAliasMock.findAlias(any(Alias.class))).thenReturn(null);
        Response respuesta = aliasService.getAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }

    @Test
    void createAliasNotFoundOkTest() throws MarvelException {
        when(daoAliasMock.updateAlias(any(Alias.class))).thenReturn(false);
        Response respuesta = aliasService.updateAlias(new AliasDto());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus());
    }

    @Test
    void updateAliasFoundOkTest() throws MarvelException {
        when(daoAliasMock.updateAlias(any(Alias.class))).thenReturn(true);
        Response respuesta = aliasService.updateAlias(new AliasDto());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoAliasMock.deleteAlias(any(Alias.class))).thenReturn(true);
        Response respuesta = aliasService.deleteAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus());
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoAliasMock.deleteAlias(any(Alias.class))).thenReturn(false);
        Response respuesta = aliasService.deleteAliasById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus());
    }
}
