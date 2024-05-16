package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AliasDto;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
@Mapper
public interface IMapperAlias {

    IMapperAlias INSTANCE = Mappers.getMapper( IMapperAlias.class );

    AliasDto aliasEntityToAliasDTO(Alias alias);

    Alias aliasDtoToAliasEntity(AliasDto aliasDto);
}
