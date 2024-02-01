package ies.puerto.PrimeraParte.vehiculos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Concesionario {

    private HashSet<String> coches;

    private List<String> motocicletas;

    public Concesionario(HashSet<String> coches) {
        this.coches = new HashSet<>();
    }

    public Concesionario(List<String> motocicletas) {
        this.motocicletas = new ArrayList<>();
    }

    public HashSet<String> getCoches() {
        return coches;
    }

    public void setCoches(HashSet<String> coches) {
        this.coches = coches;
    }

    public List<String> getMotocicletas() {
        return motocicletas;
    }

    public void setMotocicletas(List<String> motocicletas) {
        this.motocicletas = motocicletas;
    }

    public boolean addMotocicleta(Motocicleta motocicleta){
        return false;
    }

    public boolean removeMotocicleta(Motocicleta motocicleta){

        return false;
    }

    public Motocicleta obtenerMotocicleta(String matricula){

        return null;
    }

    public float velocidadMediaMotocicletas(){

        float velocidadMediaMotocicletas;

        return 0f;
    }

    public boolean addCoche(Coche coche){
        return false;
    }

    public boolean removeCoche(Coche coche){
        return false;
    }

    public Coche obtenerCoche(String matricula){
        return null;
    }

    public float velocidadMediaCoches(){

        return 0f;
    }

    public float velocidadMediaVehiculos(){

        float velocidadMediaVehiculos;


        return 0f;
    }


}
