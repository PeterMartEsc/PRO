package es.ies.puerto.file.uno;

import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class FileXmlCriatura {

    List<Criatura> criaturas;
    String path = "src/main/resources/uno.xml";


    public List<Criatura> obtenerCriaturas() {

        Persister serializer = new Persister();

        try {
            File file = new File(path);
            CriaturaList criaturaList = serializer.read(CriaturaList.class, file);
            criaturas = criaturaList.getCriaturas();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return criaturas;
    }
    public Criatura obtener(Criatura criatura) {
        if(!criaturas.contains(criatura)){
           return null;
        }

        int posicion = criaturas.indexOf(criatura);
        return criaturas.get(posicion);
    }
    public void addCriatura(Criatura criatura) {
        if(criaturas.contains(criatura)){
            return;
        }
        criaturas.add(criatura);
        actualizarFichero(criaturas);
    }
    public void deleteCriatura(Criatura criatura) {
        if(criaturas.remove(criatura)){
            actualizarFichero(criaturas);
        }

    }
    public void updateCriatura(Criatura criatura) {
        if(!criaturas.contains(criatura)){
            return;
        }

        int posicion = criaturas.indexOf(criatura);
        criaturas.set(posicion, criatura);
        actualizarFichero(criaturas);
    }


    public void actualizarFichero(List<Criatura> criaturas){

        CriaturaList criaturaList = new CriaturaList(criaturas);
        Persister serializer = new Persister();

        try {
            serializer.write(criaturaList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
