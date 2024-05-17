package es.ies.puerto.repositories;

import es.ies.puerto.models.Song;
import es.ies.puerto.services.SongService;

import java.util.ArrayList;
import java.util.List;

public class SongRepository {

    private List<Song> lista;

    public SongRepository(){
        lista = new ArrayList<>();
        lista.add(new Song("1", "Scatman","3.35"));
        lista.add(new Song("2", "Brooklyn","5.25"));
        lista.add(new Song("3", "Pedro Navaja","7.15"));
    }

    public Song getSongById(String id) {
        return lista.get(Integer.parseInt(id));
    }

    public List<Song> getSongsAll() {
        return lista;
    }

    public void saveSong(Song song){
        if(lista.contains(song)){

        }

        lista.add(song);
    }
}
