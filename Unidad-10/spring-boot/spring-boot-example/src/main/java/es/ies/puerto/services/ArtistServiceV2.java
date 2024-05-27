package es.ies.puerto.services;

import es.ies.puerto.models.Artist;
import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.ArtistRepositoryV1;
import es.ies.puerto.repositories.ArtistRepositoryV2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v2/artist")
public class ArtistServiceV2 {

    private static Logger LOG = LoggerFactory.getLogger(SongServiceV2.class);

    private ArtistRepositoryV2 artistRepositoryv2;

    public ArtistServiceV2() {
    }

    @Autowired /*Busca algo del tipo dicho y lo setea*/
    public void setArtistRepositoryV2(ArtistRepositoryV2 artistRepositoryv2) {
        this.artistRepositoryv2 = artistRepositoryv2;
    }
    @GetMapping("/")
    public List<Artist> getAll() {
        return artistRepositoryv2.getAll();
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable(name = "id") final String id) {
        return artistRepositoryv2.getArtistById(id);
    }
}
