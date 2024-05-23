package es.ies.puerto.services;

import es.ies.puerto.business.dto.AliasDto;
import es.ies.puerto.business.dto.EquipamientoDto;
import es.ies.puerto.business.dto.PoderDto;
import es.ies.puerto.mapper.classic.MapperAlias;
import es.ies.puerto.mapper.classic.MapperEquipamiento;
import es.ies.puerto.mapper.classic.MapperPoder;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.db.exception.MarvelException;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/poderes")
@Consumes("application/json")
@Produces("application/json")
public class PoderService {

    private DaoPoder daoPoder;

    public PoderService(DaoPoder daoPoder) throws MarvelException {
        this.daoPoder = new DaoPoder();
    }

    public void setDaoPoder(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    @GET
    @Path("/")
    public Response getAllPoderes() throws MarvelException {
        Set<Poder> poderes = daoPoder.findAllPoder();
        return Response.ok(poderes).build();
    }

    @GET
    @Path("/{id}")
    public Response getPoderesById(@PathParam("id") String id) throws MarvelException {
        Poder poder = new Poder(id);
        PoderDto poderDto = MapperPoder.poderEntityToPoderDTO(daoPoder.findPoder(poder));

        if (poderDto != null) {
            return Response.ok(poderDto).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response updatePoder(PoderDto poderDto) throws MarvelException {
        boolean resultado = daoPoder.updatePoder(MapperPoder.poderDtoToPoderEntity(poderDto));

        if (resultado) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response deletePoderById(@PathParam("id") String id) throws MarvelException {
        PoderDto poderDto = new PoderDto(id);
        boolean deleted = daoPoder.deletePoder(MapperPoder.poderDtoToPoderEntity(poderDto));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
