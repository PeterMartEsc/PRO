package es.ies.puerto.services;

import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.SongRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

public class SongServiceTest {
    SongServiceV2 songService;
    
    @Mock
    SongRepository songRepositoryMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        songService = new SongServiceV2();
        songService.setSongRepository(songRepositoryMock);
    }
    
    @Test
    void getAllTest() {
        when(songRepositoryMock.getSongs()).thenReturn(new ArrayList<>());
        //Response respuesta = songService.getSongs();
        //Assertions.assertNotNull(respuesta);
        //Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneOkTest() {
        when(songRepositoryMock.getSongById(anyString())).thenReturn(new Song());
        //Response respuesta = songService.getSongById("idTest");
        //Assertions.assertNotNull(respuesta);
        //Assertions.assertEquals(200,respuesta.getStatus());
    }

    @Test
    void getOneNotFoundTest() {
        when(songRepositoryMock.getSongById(anyString())).thenReturn(null);
        //Response respuesta = songService.getSongById("idTest");
        //Assertions.assertNotNull(respuesta);
        //Assertions.assertEquals(404,respuesta.getStatus());
    }

    @Test
    void saveSongOkTest() {
        when(songRepositoryMock.saveSong(any(Song.class))).thenReturn(true);
        //Response respuesta = songService.addSong(new Song());
        //Assertions.assertNotNull(respuesta);
        //Assertions.assertEquals(201,respuesta.getStatus());
    }

    @Test
    void saveSongDuplicateTest() {
        when(songRepositoryMock.saveSong(any(Song.class))).thenReturn(false);
        //Response respuesta = songService.addSong(new Song());
        //Assertions.assertNotNull(respuesta);
        //Assertions.assertEquals(304,respuesta.getStatus());
    }

    @Test
    void deleteOneOkTest() {
        when(songRepositoryMock.deleteSongById(anyString())).thenReturn(true);
        //Response respuesta = songService.deleteSongById("idTest");
        //Assertions.assertNotNull(respuesta);
        //Assertions.assertEquals(204,respuesta.getStatus());
    }

    @Test
    void deleteOneErrorTest() {
        when(songRepositoryMock.deleteSongById(anyString())).thenReturn(false);
        //Response respuesta = songService.deleteSongById("idTest");
        //Assertions.assertNotNull(respuesta);
        //Assertions.assertEquals(404,respuesta.getStatus());
    }
}
