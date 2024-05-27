package es.ies.puerto.mapper.struct;

import es.ies.puerto.business.dto.AliasDto;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface IMapperAlias {

    IMapperAlias INSTANCE = Mappers.getMapper( IMapperAlias.class );

    AliasDto aliasEntityToAliasDTO(Alias alias);

    Alias aliasDtoToAliasEntity(AliasDto aliasDto);
}
