package es.jpa.hibernate.example.modelo.interfaces;

import es.jpa.hibernate.example.modelo.entities.Aula;

public interface IAula {
    public Aula getAula(int id);
    public Aula getAula(Aula aula);
    public boolean updateAula(Aula aula);
    public boolean addAula(Aula aula);
    public void deleteAula(int id);
    public void deleteAula(Aula aula);
}
