package es.ies.puerto.services;

import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.SongRepository;

import javax.ws.rs.*;
import java.util.List;


@Path("/")

public class SongService {
    private SongRepository songRepository;
    public SongService() {
        songRepository = new SongRepository();
    }

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Song getSongById(@PathParam("id") String id) {
        return songRepository.getSongById(id);
    }

    @GET
    @Path("/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public List<Song> getSongsAll() {
        return songRepository.getSongsAll();
    }

    @POST
    @Path("/{song}")
    @Consumes({ "application/json" })
    public void addSong(@PathParam("song") Song song) {
        songRepository.saveSong(song);
    }

    @GET
    @Path("/xml/{id}")
    @Consumes({ "application/xml" })
    @Produces({ "application/xml" })
    public Song getSongXML(@PathParam("id") String id) {
        return songRepository.getSongById(id);
    }

}
