package es.ies.puerto.model.db.jpa.hibernate.impl;

import es.ies.puerto.model.db.jpa.hibernate.ICrudHibernate;
import es.ies.puerto.model.db.jpa.hibernate.abstracts.OperationsHibernateAbstracts;
import es.ies.puerto.model.impl.HeroCharacter;

import java.util.*;
import javax.persistence.*;


public class OperationsHibernate extends OperationsHibernateAbstracts implements ICrudHibernate {
    public OperationsHibernate(EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public List<HeroCharacter> obtainCharacters() {
        String query =  "SELECT ch FROM "+HeroCharacter.class.getName()+" AS ch";
        return getEm().createQuery(query, HeroCharacter.class).getResultList();
    }

    @Override
    public HeroCharacter obtainCharacter(HeroCharacter heroCharacter) {
        heroCharacter = getEm().find(HeroCharacter.class, heroCharacter.getCharacterId());
        return heroCharacter;
    }

    @Override
    public HeroCharacter obtainCharacterById(int id) {
        return obtainCharacter(new HeroCharacter(id));
    }

    @Override
    public void addCharacter(HeroCharacter heroCharacter) {
        HeroCharacter attachedEntity = getEm().merge(heroCharacter);
        getEm().getTransaction().begin();
        getEm().persist(attachedEntity);
        getEm().getTransaction().commit();
        closeEntityManager();
    }

    @Override
    public void removeCharacter(HeroCharacter heroCharacter) {
        heroCharacter = obtainCharacter(heroCharacter);
        getEm().getTransaction().begin();
        getEm().remove(heroCharacter);
        getEm().getTransaction().commit();
        closeEntityManager();
    }

    @Override
    public void removeCharacterById(int id) {
        removeCharacter(new HeroCharacter(id));
    }

    @Override
    public void updateCharacter(HeroCharacter heroCharacter) {
        getEm().getTransaction().begin();
        getEm().merge(heroCharacter);
        getEm().getTransaction().commit();
        closeEntityManager();
    }



}
