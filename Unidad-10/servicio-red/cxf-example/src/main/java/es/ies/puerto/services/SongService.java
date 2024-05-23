package es.ies.puerto.services;

import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.SongRepository;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/")
@Consumes("application/json")
@Produces("application/json")
public class SongService {


    private SongRepository songRepository;

    public void setSongRepository(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public SongService() {
        songRepository = new SongRepository();
    }

    @GET
    @Path("/{id}")
    public Response getSongById(@PathParam("id") String id) {
        Song song = songRepository.getSongById(id);
        if (song != null) {
            return Response.ok(song).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    public Response getSongs() {
        List<Song> songs = songRepository.getSongs();
        return Response.ok(songs).build();
    }

    @POST
    public Response addSong(Song song) {
        boolean resultado = songRepository.saveSong(song);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response deleteSongById(@PathParam("id") String id) {
        boolean deleted = songRepository.deleteSongById(id);
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/xml/{id}")
    @Produces("application/xml")
    public Response getSongXml(@PathParam("id") String id) {
        Song song = songRepository.getSongById(id);
        if (song != null) {
            return Response.ok(song).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
