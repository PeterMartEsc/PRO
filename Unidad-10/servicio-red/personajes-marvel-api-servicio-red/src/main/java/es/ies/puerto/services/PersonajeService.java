package es.ies.puerto.services;

import es.ies.puerto.business.dto.EquipamientoDto;
import es.ies.puerto.business.dto.PersonajeDto;
import es.ies.puerto.mapper.struct.IMapperEquipamiento;
import es.ies.puerto.mapper.struct.IMapperPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.exception.MarvelException;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;
@Path("/personajes")
@Consumes("application/json")
@Produces("application/json")
public class PersonajeService {

    private DaoPersonaje daoPersonaje;

    public PersonajeService() throws MarvelException {
        this.daoPersonaje = new DaoPersonaje();
    }

    public void setDaoPersonaje(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    @GET
    @Path("/")
    public Response getAllPersonajes() throws MarvelException {
        Set<PersonajeDto> personajes = new HashSet<>();
        for (Personaje personajedb : daoPersonaje.findAllPersonaje()) {
            personajes.add(IMapperPersonaje.INSTANCE.personajeEntityToPersonajeDTO(personajedb));
        }
        return Response.ok(personajes).build();
    }

    @GET
    @Path("/{id}")
    public Response getPersonajeById(@PathParam("id") String id) throws MarvelException {
        Personaje personaje = new Personaje(id);
        PersonajeDto personajeDto = IMapperPersonaje.INSTANCE.INSTANCE.personajeEntityToPersonajeDTO(daoPersonaje.findPersonaje(personaje));

        if (personajeDto != null) {
            return Response.ok(personajeDto).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response updatePersonaje(PersonajeDto personajeDto) throws MarvelException {
        boolean resultado = daoPersonaje.updatePersonaje(IMapperPersonaje.INSTANCE.personajeDtoToPersonajeEntity(personajeDto));

        if (resultado) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response deletePersonajeById(@PathParam("id") String id) throws MarvelException {
        PersonajeDto personajeDto = new PersonajeDto(id);
        boolean deleted = daoPersonaje.deletePersonaje(IMapperPersonaje.INSTANCE.personajeDtoToPersonajeEntity(personajeDto));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
