package es.ies.puerto.mapper;

import es.ies.puerto.intercambio.AliasInt;
import es.ies.puerto.modelo.db.entidades.Alias;

public class MapperAliasToAlias {

    public static Alias AliasIntToAliasEntity(AliasInt aliasInt){
        Alias alias;

        if(aliasInt == null){
            return new Alias();
        }

        alias = new Alias();
        alias.setId(aliasInt.getId());
        alias.setDescripcion(aliasInt.getDescripcion());
        return alias;
    }
    public static AliasInt AliasEntityToAliasInt(Alias alias){
        AliasInt aliasInt;

        if(alias == null){
            return null;
        }

        aliasInt = new AliasInt();
        aliasInt.setId(alias.getId());
        aliasInt.setDescripcion(alias.getDescripcion());
        return aliasInt;
    }

}
