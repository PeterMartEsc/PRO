package es.ies.puerto.repositories;

import es.ies.puerto.models.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("ArtistRepositoryV2")
public class ArtistRepositoryV2 {
    private ArtistRepositoryV1 artistRepositoryV1;

    public ArtistRepositoryV2() {
    }
    @Autowired
    public void setArtistRepositoryV1(ArtistRepositoryV1 artistRepositoryV1) {
        this.artistRepositoryV1 = artistRepositoryV1;
    }

    public List<Artist> getAll() {
        return artistRepositoryV1.getAll();
    }

    public Artist getArtistById(String id) {
        return artistRepositoryV1.getArtistById(id);
    }
}
