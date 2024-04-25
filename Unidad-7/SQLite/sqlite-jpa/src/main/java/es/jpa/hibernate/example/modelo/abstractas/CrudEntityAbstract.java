package es.jpa.hibernate.example.modelo.abstractas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class CrudEntityAbstract {
    EntityManager em;

    EntityManagerFactory emf;

    public CrudEntityAbstract(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEm() {
        if (em == null || (!em.isOpen())) {
            em = emf.createEntityManager();
        }
        return em;
    }
}
