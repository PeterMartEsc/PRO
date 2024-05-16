package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.PoderDto;
import es.ies.puerto.modelo.db.entidades.Poder;

public class MapperPoder {

    public static PoderDto poderEntityToPoderDTO (Poder poder){
        if(poder == null){
            return null;
        }

        PoderDto poderDto = new PoderDto();
        poderDto.setId(poder.getId());
        poderDto.setNombre(poder.getNombre());

        return poderDto;
    }

    public static Poder poderEntityToPoderDTO (PoderDto poderDto){
        if(poderDto == null){
            return null;
        }

        Poder poder = new Poder();
        poder.setId(poderDto.getId());
        poder.setNombre(poderDto.getNombre());

        return poder;
    }
}
