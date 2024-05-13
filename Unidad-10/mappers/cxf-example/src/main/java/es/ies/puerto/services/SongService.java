package es.ies.puerto.services;

import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.SongRepository;

import javax.ws.rs.*;

@Path("/")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class SongService {

    private SongRepository songRepository;

    public SongService(){
        songRepository = new SongRepository();
    }

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Song getSongById(@PathParam("id") String id) {
        return songRepository.getSongById(id);
    }
}