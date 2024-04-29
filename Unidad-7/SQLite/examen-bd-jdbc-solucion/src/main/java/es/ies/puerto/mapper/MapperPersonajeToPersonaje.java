package es.ies.puerto.mapper;

import es.ies.puerto.intercambio.PersonajeInt;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class MapperPersonajeToPersonaje {

    public static Personaje personajeIntToPersonajeEntity(PersonajeInt personajeInt){
        Personaje personaje = null;

        if(personajeInt == null){
            return null;
        }

        personaje = new Personaje();
        personaje.setId(personajeInt.getId());
        personaje.setAlias(MapperAliasToAlias.AliasIntToAliasEntity(personajeInt.getAliasInt()));
        return personaje;
    }
    public PersonajeInt personajeEntityToPersonajeInt(Personaje personaje){
        PersonajeInt personajeInt = null;
        if(personaje == null){
            return null;
        }

        personajeInt = new PersonajeInt();
        personajeInt.setId(personaje.getId());
        personaje.setAlias(MapperAliasToAlias.AliasIntToAliasEntity(personajeInt.getAliasInt()));
        return personajeInt;
    }
}
