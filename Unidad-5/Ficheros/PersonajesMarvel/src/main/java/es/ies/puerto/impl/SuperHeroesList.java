package es.ies.puerto.impl;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "personajes")
public class SuperHeroesList {

    @ElementList(inline = true)
    private List<SuperHeroe> superHeroes;

    public SuperHeroesList(){

    }

    public SuperHeroesList(List<SuperHeroe> superHeroes) {
        this.superHeroes = superHeroes;
    }

    public List<SuperHeroe> getPersonas() {
        return superHeroes;
    }

    public void setSuperHeroes(List<SuperHeroe> superHeroes) {
        this.superHeroes = superHeroes;
    }

}
