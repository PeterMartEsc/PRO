package es.ies.puerto.services;

import es.ies.puerto.business.dto.AliasDto;
import es.ies.puerto.business.dto.PersonajeDto;
import es.ies.puerto.mapper.classic.MapperAlias;
import es.ies.puerto.mapper.classic.MapperPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.exception.MarvelException;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;
@Path("/personajes")
@Consumes("application/json")
@Produces("application/json")
public class PersonajeService {

    private DaoPersonaje daoPersonaje;

    public PersonajeService(DaoPersonaje daoPersonaje) throws MarvelException {
        this.daoPersonaje = new DaoPersonaje();
    }

    public void setDaoPersonaje(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    @GET
    @Path("/")
    public Response getAllPersonajes() throws MarvelException {
        Set<Personaje> personajes = daoPersonaje.findAllPersonaje();
        return Response.ok(personajes).build();
    }

    @GET
    @Path("/{id}")
    public Response getAPersonajeById(@PathParam("id") String id) throws MarvelException {
        Personaje personaje = new Personaje(id);
        PersonajeDto personajeDto = MapperPersonaje.personajeEntityToPersonajeDTO(daoPersonaje.findPersonaje(personaje));

        if (personajeDto != null) {
            return Response.ok(personajeDto).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response updatePersonaje(PersonajeDto personajeDto) throws MarvelException {
        boolean resultado = daoPersonaje.updatePersonaje(MapperPersonaje.personajeDtoToPersonajeEntity(personajeDto));

        if (resultado) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response deleteEquipamientoById(@PathParam("id") String id) throws MarvelException {
        PersonajeDto personajeDto = new PersonajeDto(id);
        boolean deleted = daoPersonaje.deletePersonaje(MapperPersonaje.personajeDtoToPersonajeEntity(personajeDto));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
