package es.ies.puerto.mapper.struct;

import es.ies.puerto.business.dto.PoderDto;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperPoder {
    IMapperPoder INSTANCE = Mappers.getMapper( IMapperPoder.class );

    PoderDto poderEntityToPoderDTO(Poder poder);

    Poder poderDtoToPoderEntity(PoderDto poderDTO);
}
