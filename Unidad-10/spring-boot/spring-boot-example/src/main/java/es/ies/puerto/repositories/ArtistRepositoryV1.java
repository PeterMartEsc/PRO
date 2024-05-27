package es.ies.puerto.repositories;

import es.ies.puerto.models.Artist;
import es.ies.puerto.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("ArtistRepository")
public class ArtistRepositoryV1 {
    private List<Artist> list;

    private SongRepository songRepository;

    @Autowired
    public void setSongRepository(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public ArtistRepositoryV1() {
        list = new ArrayList<>();
        list.add(new Artist("1", "Scatman"));
        list.add(new Artist("2", "Michael Jackson"));
    }

    public Artist getArtistById(String id) {
        Artist artist = new Artist(id);
        int indice = list.indexOf(artist);
        if (indice >=0) {

            artist = list.get(indice);
            artist.getSongs().add(songRepository.getSongById(id));
            return artist;
        }
        return null;
    }

    public List<Artist> getAll() {
        return list;
    }
}
