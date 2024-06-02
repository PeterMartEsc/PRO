package es.ies.puerto.file.dos;

import es.ies.puerto.file.uno.FileXmlCriatura;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static utilidades.UtilClassTest.MESSAGE_ERROR;

public class FileAnimeJsonTest {


    FileAnimeJson persistencia;

    List<Anime> animeList;

    @BeforeEach
    public void beforeEach() {
        persistencia = new FileAnimeJson();
        animeList = persistencia.obtenerAnimes();
    }

    @Test
    public void obtenerAnimesTest() {
        Assertions.assertFalse(animeList.isEmpty(),
                MESSAGE_ERROR);
        Assertions.assertEquals(5, animeList.size(),
                MESSAGE_ERROR);
    }

    @Test
    public void obtenerAnimeTest() {
        String idBuscar = "SG001";
        Anime animeBuscar = new Anime(idBuscar);
        animeBuscar = persistencia.obtenerAnime(animeBuscar);
        Assertions.assertEquals(animeBuscar.getId(),idBuscar,
                MESSAGE_ERROR);
        Assertions.assertNotNull(animeBuscar.getNombre(),
                MESSAGE_ERROR);
        Assertions.assertTrue (animeBuscar.getPoderEspecial().equals("Kamehameha"),
                MESSAGE_ERROR);
        Assertions.assertNotNull(animeBuscar.getDescripcion().equals("El guerrero saiyajin más fuerte del universo."),
                MESSAGE_ERROR);
    }

    @Test
    public void addDeleteAnimeTest() {

        int numAnimesInicial = animeList.size();
        Anime AnimeInsertar = new Anime("J0J0", "Jotaro Kujo", "Jojos Bizzarre Adventures",
                "Stand: Star Platinum", "Es el nieto de Joseph Joestar y tataranieto de Jonathan Joestar");

        persistencia.addAnime(AnimeInsertar);
        animeList = persistencia.obtenerAnimes();
        int numAnimesInsertar = animeList.size();
        Assertions.assertTrue(animeList.contains(AnimeInsertar),
                MESSAGE_ERROR);
        Assertions.assertEquals(numAnimesInicial +1 ,
                numAnimesInsertar, MESSAGE_ERROR);
        persistencia.deleteAnime(AnimeInsertar);
        animeList = persistencia.obtenerAnimes();
        int numanimesBorrado = animeList.size();
        Assertions.assertEquals(numAnimesInicial ,
                numanimesBorrado,
                MESSAGE_ERROR);
    }

    @Test
    public void actualizarAnime() {
        String idActualizar = "SG001";
        Anime AnimeBuscar = new Anime(idActualizar);
        Anime AnimeActualizar = persistencia.obtenerAnime(AnimeBuscar);
        Anime AnimeBackup = persistencia.obtenerAnime(AnimeBuscar);
        AnimeActualizar.setNombre("Son Gohanda");
        AnimeActualizar.setDescripcion("El hijo del guerrero saiyajin mas poderoso del multiverso. Es uno de los mas poderosos del multiverso");
        persistencia.updateAnime(AnimeActualizar);

        AnimeBuscar = persistencia.obtenerAnime(AnimeBuscar);
        Assertions.assertEquals(AnimeBuscar.toString(), AnimeActualizar.toString(),
                MESSAGE_ERROR);
        persistencia.updateAnime(AnimeBackup);

    }

}
