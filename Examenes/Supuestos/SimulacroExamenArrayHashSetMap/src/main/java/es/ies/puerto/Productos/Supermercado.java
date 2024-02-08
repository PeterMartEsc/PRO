package es.ies.puerto.Productos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Supermercado {

    private HashSet<Alimento> alimentos;

    private ArrayList<Electronica> electronicas;

    private HashMap<String, Souvenir> souvenirs;

    public Supermercado() {
        alimentos = new HashSet<>();
        electronicas = new ArrayList<>();
        souvenirs = new HashMap<>();
    }

    public Supermercado(HashSet<Alimento> alimentos, ArrayList<Electronica> electronicas, HashMap<String, Souvenir> souvenirs) {
        this.alimentos = alimentos;
        this.electronicas = electronicas;
        this.souvenirs = souvenirs;
    }

    public HashSet<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(HashSet<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public ArrayList<Electronica> getElectronicas() {
        return electronicas;
    }

    public void setElectronicas(ArrayList<Electronica> electronicas) {
        this.electronicas = electronicas;
    }

    public HashMap<String, Souvenir> getSouvenirs() {
        return souvenirs;
    }

    public void setSouvenirs(HashMap<String, Souvenir> souvenirs) {
        this.souvenirs = souvenirs;
    }

    public boolean addAlimento(Alimento alimento){

        if(!alimentos.contains(alimento)){
            alimentos.add(alimento);
        }
        return true;
    }

    public boolean removeAlimento(Alimento alimento){
        if(alimentos.contains(alimento)){
            alimentos.remove(alimento);
        }

        return true;
    }

    public Alimento obtenerAlimento(String udi){

        Alimento alimento1 = new Alimento(udi);

        if(alimentos.isEmpty()){
            return null;
        }

        for(Alimento alimento : alimentos){
            if(alimento.equals(alimento1)){
                return alimento;
            }
        }
        return null;
    }

    //public Alimento obtenerAlimientosCaducados(String fechaEntrada){

    //}

    public boolean addElectronica(Electronica electronica){

        if(!electronicas.contains(electronica)){
            electronicas.add(electronica);
        }
        return true;
    }

    public boolean removeElectronica(Electronica electronica){
        if(electronicas.contains(electronica)){
            electronicas.remove(electronica);
        }

        return true;
    }

    public Electronica obtenerElectronica(String udi){

        Electronica electronica1 = new Electronica(udi);

        if(electronicas.isEmpty()){
            return null;
        }

        for(Electronica electronica : electronicas){
            if(electronica.equals(electronica1)){
                return electronica;
            }
        }
        return null;
    }

    public boolean addSouvenir(Souvenir souvenir){

        if(!souvenirs.containsValue(souvenir)){
            souvenirs.put(souvenir.getUdi(), souvenir);
        }
        return true;
    }

    public boolean removeSouvenir(Souvenir souvenir){

        if(souvenirs.containsValue(souvenir)){
            souvenirs.remove(souvenir.getUdi(), souvenir);
        }

        return true;
    }

    public Souvenir obtenerSouvenir(String udi){

        if(souvenirs.containsKey(udi)){
            souvenirs.get(udi);
        }

        return null;
    }

    public float precioAlimentos(Alimento alimento){

        if(alimento.getPrecio() > alimento.precioMaximo()){
            return alimento.precioMaximo();
        }

        return alimento.getPrecio();
    }
    public float precioElectronica(Electronica electronica){

        if(electronica.getPrecio() > electronica.precioMaximo()){
            return electronica.precioMaximo();
        }

        return electronica.getPrecio();
    }

    public float precioSouvenirs(Souvenir souvenir){

        if(souvenir.getPrecio() > souvenir.precioMaximo()){
            return souvenir.precioMaximo();
        }

        return souvenir.getPrecio();
    }

    //public float precioProductos(){

    //}

    @Override
    public String toString() {
        return "Supermercado{" +
                "alimentos=" + alimentos +
                ", electronicas=" + electronicas +
                ", souvenirs=" + souvenirs +
                '}';
    }
}
