package es.ies.puerto.mapper;

import es.ies.puerto.dto.AliasDto;
import es.ies.puerto.modelo.db.entidades.Alias;

public class MapperAlias {

    public static AliasDto aliasEntityToAliasDTO (Alias alias){
        if(alias == null){
            return null;
        }

        AliasDto aliasDto = new AliasDto();
        aliasDto.setId(alias.getId());
        aliasDto.setDescripcion(alias.getDescripcion());
        aliasDto.setPersonaje_id(alias.getPersonaje_id());

        return aliasDto;
    }

    public static Alias aliasDtoToAliasEntity (AliasDto aliasDto){
        if(aliasDto == null){
            return null;
        }

        Alias alias = new Alias();
        alias.setId(aliasDto.getId());
        alias.setDescripcion(aliasDto.getDescripcion());
        alias.setPersonaje_id(aliasDto.getPersonaje_id());

        return alias;
    }
}
