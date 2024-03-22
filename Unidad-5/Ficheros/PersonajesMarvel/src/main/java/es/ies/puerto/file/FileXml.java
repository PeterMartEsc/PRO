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
    String path="src/main/resources/data.xml";
    List<SuperHeroe> superHeroes;
    final List<SuperHeroe> personajesBackup = obtenerSuperHeroes();

    public FileXml() {
        this.superHeroes = new ArrayList<>();
    }

    @Override
    public List<SuperHeroe> obtenerSuperHeroes() {

        Persister serializer = new Persister();
        try{
            File file = new File(path);
            SuperHeroesList superHeroesList = serializer.read(SuperHeroesList.class, file);
            superHeroes = superHeroesList.getSuperHeroes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return superHeroes;
    }

    @Override
    public SuperHeroe obtenerSuperHeroe(SuperHeroe superHeroe) {
        if (!superHeroes.contains(superHeroe)){
            return null;
        }
        int posicion = superHeroes.indexOf(superHeroe);
        return superHeroes.get(posicion);
    }

    @Override
    public void addHeroe(SuperHeroe superHeroe) {

        if (superHeroes.contains(superHeroe)){
            return;
        }
        superHeroes.add(superHeroe);
        actualizarFichero(superHeroes);
    }

    @Override
    public void deleteHeroe(SuperHeroe superHeroe) {
        if (superHeroes.remove(superHeroe)){
            actualizarFichero(superHeroes);
        }
    }

    @Override
    public void updateHeroe(SuperHeroe superHeroe) {
        if (!superHeroes.contains(superHeroe)){
            return;
        }
        int posicion = superHeroes.indexOf(superHeroe);
        superHeroes.set(posicion,superHeroe);
        actualizarFichero(superHeroes);
    }

    public void cargarBackup() {
        actualizarFichero(personajesBackup);
    }

    public void actualizarFichero(List<SuperHeroe> superHeroes){

        SuperHeroesList superHeroesList = new SuperHeroesList(superHeroes);

        Persister serializer = new Persister();

        try {
            serializer.write(superHeroesList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
