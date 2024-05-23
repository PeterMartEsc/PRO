package es.ies.puerto.services;

import es.ies.puerto.business.dto.AliasDto;
import es.ies.puerto.mapper.classic.MapperAlias;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.exception.MarvelException;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/alias")
@Consumes("application/json")
@Produces("application/json")
public class AliasService {

    private DaoAlias daoAlias;

    public AliasService(DaoAlias daoAlias) throws MarvelException {
        this.daoAlias = new DaoAlias();
    }

    public void setDaoAlias(DaoAlias daoAlias) {
        this.daoAlias = daoAlias;
    }

    @GET
    @Path("/")
    public Response getAllAlias() throws MarvelException {
        Set<Alias> aliases = daoAlias.findAllAlias();
        return Response.ok(aliases).build();
    }

    @GET
    @Path("/{id}")
    public Response getAliasById(@PathParam("id") String id) throws MarvelException {
        Alias alias = new Alias(id);
        AliasDto aliasDto = MapperAlias.aliasEntityToAliasDTO(daoAlias.findAlias(alias));

        if (aliasDto != null) {
            return Response.ok(aliasDto).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response updateAlias(AliasDto aliasDto) throws MarvelException {
        boolean resultado = daoAlias.updateAlias(MapperAlias.aliasDtoToAliasEntity(aliasDto));

        if (resultado) {
            return Response.status(Response.Status.OK).build();
        }
        return Response.status(Response.Status.CREATED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response deleteEquipamientoById(@PathParam("id") String id) throws MarvelException {
        AliasDto aliasDto = new AliasDto(id);
        boolean deleted = daoAlias.deleteAlias(MapperAlias.aliasDtoToAliasEntity(aliasDto));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
