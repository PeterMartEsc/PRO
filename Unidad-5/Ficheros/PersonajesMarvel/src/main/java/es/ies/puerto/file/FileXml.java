package es.ies.puerto.file;

import es.ies.puerto.impl.SuperHeroe;
import es.ies.puerto.impl.SuperHeroesList;
import es.ies.puerto.interfaces.ICrudOperations;
import es.ies.puerto.utilities.UtilidadesClass;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml extends UtilidadesClass implements ICrudOperations {

    List<SuperHeroe> superHeroes;
    String path="src/main/resources/data.xml";

    public FileXml(){

    }

    public FileXml(List<SuperHeroe> superHeroes) {
        this.superHeroes = new ArrayList<>();
    }

    @Override
    public List<SuperHeroe> obtenerSuperHeroes() {

        Persister serializer = new Persister();
        try {
            File file = new File(path);
            SuperHeroesList superHeroesList = serializer.read(SuperHeroesList.class, file);
            superHeroes = superHeroesList.getPersonas();
            return superHeroes;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public SuperHeroe obtenerSuperHeroe(SuperHeroe superHeroe) {
        int posicion =  superHeroes.indexOf(superHeroe);
        if (posicion > 0 ) {
            return superHeroes.get(posicion);
        }
        return null;
    }

    @Override
    public void addHeroe(SuperHeroe superHeroe) {

        superHeroes.add(superHeroe);
        SuperHeroesList superHeroesList = new SuperHeroesList(superHeroes);

        Persister serializer = new Persister();

        try {
            serializer.write(superHeroesList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteHeroe(SuperHeroe superHeroe) {
        superHeroes.remove(superHeroe);
        SuperHeroesList superHeroesList = new SuperHeroesList(superHeroes);
        Persister serializer = new Persister();

        try {
            serializer.write(superHeroesList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateHeroe(SuperHeroe superHeroe) {
        int posicion =  superHeroes.indexOf(superHeroe);
        if (posicion < 0 ) {
            return;
        }
        superHeroes.set(posicion,superHeroe);
        SuperHeroesList superHeroesList = new SuperHeroesList(superHeroes);
        Persister serializer = new Persister();
        try {
            serializer.write(superHeroesList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
