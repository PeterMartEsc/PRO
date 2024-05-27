package es.ies.puerto.mapper.struct;

import es.ies.puerto.business.dto.PersonajeDto;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {IMapperAlias.class, IMapperEquipamiento.class, IMapperPoder.class})
public interface IMapperPersonaje {

    IMapperPersonaje INSTANCE = Mappers.getMapper( IMapperPersonaje.class );

    PersonajeDto personajeEntityToPersonajeDTO(Personaje personaje);

    Personaje personajeDtoToPersonajeEntity(PersonajeDto personajeDto);
}
