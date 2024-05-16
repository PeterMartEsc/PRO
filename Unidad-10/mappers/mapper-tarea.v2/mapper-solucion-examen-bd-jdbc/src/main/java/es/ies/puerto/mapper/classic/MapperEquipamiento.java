package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.EquipamientoDto;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

public class MapperEquipamiento {

    public static EquipamientoDto equipamientoEntityToEquipamientoDTO (Equipamiento equipamiento){
        if(equipamiento == null){
            return null;
        }

        EquipamientoDto equipamientoDto = new EquipamientoDto();
        equipamientoDto.setId(equipamiento.getId());
        equipamientoDto.setNombre(equipamiento.getNombre());
        equipamientoDto.setDescripcion(equipamiento.getDescripcion());
        equipamientoDto.setPersonaje_id(equipamiento.getPersonaje_id());

        return equipamientoDto;
    }

    public static Equipamiento equipamientoDtoToEquipamientoEntity (EquipamientoDto equipamientoDto){
        if(equipamientoDto == null){
            return null;
        }

        Equipamiento equipamiento = new Equipamiento();
        equipamiento.setId(equipamientoDto.getId());
        equipamiento.setNombre(equipamientoDto.getNombre());
        equipamiento.setDescripcion(equipamientoDto.getDescripcion());
        equipamiento.setPersonaje_id(equipamientoDto.getPersonaje_id());

        return equipamiento;
    }
}
