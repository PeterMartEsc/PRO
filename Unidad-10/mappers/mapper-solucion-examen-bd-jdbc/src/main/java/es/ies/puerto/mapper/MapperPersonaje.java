package es.ies.puerto.mapper;

import es.ies.puerto.dto.PersonajeDto;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class MapperPersonaje {

    public static PersonajeDto personajeEntityToPersonajeDTO (Personaje personaje){
        if(personaje == null){
            return null;
        }

        PersonajeDto personajeDto = new PersonajeDto();
        personajeDto.setId(personaje.getId());
        personajeDto.setNombre(personaje.getNombre());
        personajeDto.setGenero(personaje.getGenero());
        personajeDto.setAlias(personaje.getAlias());
        personajeDto.setEquipamientos(personaje.getEquipamientos());
        personajeDto.setPoderes(personaje.getPoderes());

        return personajeDto;
    }

    public static Personaje personajeDtoToPersonajeEntity (PersonajeDto personajeDto){
        if(personajeDto == null){
            return null;
        }

        Personaje personaje = new Personaje();
        personaje.setId(personajeDto.getId());
        personaje.setNombre(personajeDto.getNombre());
        personaje.setGenero(personajeDto.getGenero());
        personaje.setAlias(personajeDto.getAlias());
        personaje.setEquipamientos(personajeDto.getEquipamientos());
        personaje.setPoderes(personajeDto.getPoderes());

        return personaje;
    }
}
