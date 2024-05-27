package es.ies.puerto.services;

import es.ies.puerto.models.Artist;
import es.ies.puerto.repositories.ArtistRepositoryV1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/artist")
public class ArtistService {

    private static Logger LOG = LoggerFactory.getLogger(SongServiceV2.class);

    private ArtistRepositoryV1 artistRepositoryv1;

    public ArtistService() {
    }

    @Autowired /*Busca algo del tipo dicho y lo setea*/
    public void setArtistRepository(ArtistRepositoryV1 artistRepositoryv1) {
        this.artistRepositoryv1 = artistRepositoryv1;
    }
    @GetMapping("/")
    public List<Artist> getAll() {
        return artistRepositoryv1.getAll();
    }
}
