package es.ies.puerto.mapper.struct;

import es.ies.puerto.business.dto.EquipamientoDto;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper( IMapperEquipamiento.class );

    EquipamientoDto equipamientoEntityToEquipamientoDTO(Equipamiento equipamiento);

    Equipamiento equipamientoDtoToEquipamientoEntity(EquipamientoDto equipamientoDto);
}
