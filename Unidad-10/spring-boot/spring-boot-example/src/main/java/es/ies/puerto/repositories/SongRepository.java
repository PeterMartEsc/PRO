package es.ies.puerto.repositories;

import es.ies.puerto.models.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("SongRepository")
public class SongRepository {
    private List<Song> lista;

    public SongRepository(){
        lista = new ArrayList<>();
        lista.add(new Song("1", "Scatman","3.35"));
        lista.add(new Song("2", "Bilie Jean","3.25"));
    }

    public Song getSongById(String id) {
        Song song = new Song(id);
        int indice = lista.indexOf(song);
        if (indice >=0) {
            return lista.get(indice);
        }
        return null;
    }

    public List<Song> getSongs() {
        return lista;
    }

    public boolean saveSong(Song song) {
        if (lista.contains(song)) {
            return false;
        }
        return lista.add(song);
    }

    public boolean deleteSongById(String id) {
        Song song = new Song(id);
        return lista.remove(song);
    }
}
