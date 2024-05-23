package es.ies.puerto.services;

import es.ies.puerto.business.dto.AliasDto;
import es.ies.puerto.business.dto.EquipamientoDto;
import es.ies.puerto.mapper.classic.MapperAlias;
import es.ies.puerto.mapper.classic.MapperEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.exception.MarvelException;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/equipamientos")
@Consumes("application/json")
@Produces("application/json")
public class EquipamientoService {

    private DaoEquipamiento daoEquipamiento;

    public EquipamientoService(DaoEquipamiento daoEquipamiento) throws MarvelException {
        this.daoEquipamiento = new DaoEquipamiento();
    }

    public void setDaoEquipamiento(DaoEquipamiento daoEquipamiento) {
        this.daoEquipamiento = daoEquipamiento;
    }

    @GET
    @Path("/")
    public Response getAllEquipamientos() throws MarvelException {
        Set<Equipamiento> equipamientos = daoEquipamiento.findAllEquipamiento();
        return Response.ok(equipamientos).build();
    }
    @GET
    @Path("/{id}")
    public Response getEquipamientoById(@PathParam("id") String id) throws MarvelException {
        Equipamiento equipamiento = new Equipamiento(id);
        EquipamientoDto equipamientoDto = MapperEquipamiento.equipamientoEntityToEquipamientoDTO(daoEquipamiento.findEquipamiento(equipamiento));

        if (equipamientoDto != null) {
            return Response.ok(equipamiento).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response updateEquipamiento(EquipamientoDto equipamientoDto) throws MarvelException {
        boolean resultado = daoEquipamiento.updateEquipamiento(MapperEquipamiento.equipamientoDtoToEquipamientoEntity(equipamientoDto));

        if (resultado) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response deleteEquipamientoById(@PathParam("id") String id) throws MarvelException {
        EquipamientoDto equipamientoDto = new EquipamientoDto(id);
        boolean deleted = daoEquipamiento.deleteEquipamiento(MapperEquipamiento.equipamientoDtoToEquipamientoEntity(equipamientoDto));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
