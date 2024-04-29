package es.ies.puerto.intercambio;

import java.io.Serializable;

public class PersonajeInt implements Serializable {

    String id;
    AliasInt aliasInt;

    public PersonajeInt() {
    }

    public PersonajeInt(String id) {
        this.id = id;
    }

    public PersonajeInt(String id, AliasInt aliasint) {
        this.id = id;
        this.aliasInt = aliasint;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AliasInt getAliasInt() {
        return aliasInt;
    }

    public void setAliasInt(AliasInt aliasInt) {
        this.aliasInt = aliasInt;
    }
}
