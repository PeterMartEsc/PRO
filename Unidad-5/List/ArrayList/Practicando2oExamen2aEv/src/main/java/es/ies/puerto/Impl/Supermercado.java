package es.ies.puerto.Impl;

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

    public Supermercado(HashSet<Alimento> alimentos, ArrayList<Electronica> electronicas, HashMap<String, Souvenir>
            souvenirs) {
        this.alimentos = alimentos;
        this.electronicas = electronicas;
        this.souvenirs = souvenirs;
    }

    public boolean addAlimento (Alimento alimento){
        if(!alimentos.contains(alimento)){
            return alimentos.add(alimento);
        }
        return true;
    }

    public boolean removeAlimento(Alimento alimento){
        if(alimentos.contains(alimento)){
            return removeAlimento(alimento);
        }

        return true;
    }

    public boolean addElectronica(Electronica electronica){
        if(!electronicas.contains(electronica)){
            return addElectronica(electronica);
        }
        return true;
    }

    public boolean addSouvenir(Souvenir souvenir){

        if(!souvenirs.containsValue(souvenir)){
            souvenirs.put(souvenir.getUdi(), souvenir);
        }

        return true;
    }

    public Electronica buscarElectronica (String udi){

        Electronica electronica = new Electronica(udi);

        if(electronicas.isEmpty()){
            return null;
        }

        for(Electronica electronica1 : electronicas){
            if(electronica.equals(electronica)){
                return electronica;
            }
        }
        return null;
    }

    public Souvenir obtenerSouvenir(String udi){

        Souvenir souvenir = new Souvenir(udi);

        if(souvenirs.isEmpty()){
            return null;
        }

        if(souvenirs.containsKey(udi)){
            return souvenirs.get(udi);
        }

        return null;

    }



}
