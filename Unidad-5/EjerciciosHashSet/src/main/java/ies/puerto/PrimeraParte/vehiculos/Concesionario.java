package ies.puerto.PrimeraParte.vehiculos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Concesionario {

    private HashSet<Coche> coches;

    private List<Motocicleta> motocicletas;

    public Concesionario() {
        coches = new HashSet<>();
        motocicletas = new ArrayList<>();
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
    }

    public HashSet<Coche> getCoches() {
        return coches;
    }

    public void setCoches(HashSet<Coche> coches) {
        this.coches = coches;
    }

    public List<Motocicleta> getMotocicletas() {
        return motocicletas;
    }

    public void setMotocicletas(List<Motocicleta> motocicletas) {
        this.motocicletas = motocicletas;
    }

    public boolean addMotocicleta(Motocicleta motocicleta){

        if(!motocicletas.contains(motocicleta)){
            return motocicletas.add(motocicleta);
        }

        return true;
    }

    public boolean removeMotocicleta(Motocicleta motocicleta){

        if(motocicletas.contains(motocicleta)){
            return motocicletas.remove(motocicleta);
        }

        return true;
    }

    public Motocicleta obtenerMotocicleta (String matricula) {

        Motocicleta motocicleta1 = new Motocicleta(matricula);

        if (!motocicletas.contains(motocicleta1)) {
            return null;
        }

        for (Motocicleta motocicleta: motocicletas) {
            if (motocicleta.equals(motocicleta1)) {
                return motocicleta;
            }
        }

        return null;
    }

    public float velocidadMediaMotocicletas(){

        float resultado=0f;

        if(motocicletas.isEmpty()){
            return resultado;
        }

        for(Motocicleta motocicleta : motocicletas){
            resultado+=motocicleta.getVelocidad();
        }

        return resultado/motocicletas.size();
    }

    public boolean addCoche(Coche coche){

        coches.add(coche);  //Hash set siempre añade coche por que no pueden haber repetidos
        return true;
    }

    public boolean removeCoche(Coche coche){

        return true;
    }

    public Coche obtenerCoche(String matricula){

        Coche coche1 = new Coche(matricula);

        if (!coches.contains(coche1)) {
            return null;
        }

        for (Coche coche : coches) {
            if (coche.equals(coche1)) {
                return coche;
            }
        }

        return null;
    }

    public float velocidadMediaCoches(){

        float resultado=0f;

        if(coches.isEmpty()){
            return resultado;
        }

        for(Coche coche : coches){
            resultado+=coche.getVelocidad();
        }

        return resultado/coches.size();
    }

    public float velocidadMediaVehiculos(){

        float resultado=0f;

        if(coches.isEmpty() && motocicletas.isEmpty()){
            return resultado;
        }

        resultado=velocidadMediaCoches()+velocidadMediaMotocicletas();

        return resultado/2;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "coches=" + coches +
                ", motocicletas=" + motocicletas +
                '}';
    }
}
