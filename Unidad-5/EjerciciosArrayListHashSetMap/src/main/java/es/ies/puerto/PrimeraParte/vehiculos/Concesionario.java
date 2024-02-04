package es.ies.puerto.PrimeraParte.vehiculos;

import com.ibm.cuda.CudaJitOptions;
import es.ies.puerto.SegundaParte.vehiculos.Bicicleta;
import es.ies.puerto.SegundaParte.vehiculos.Camion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Concesionario {

    private HashSet<Coche> coches;

    private List<Motocicleta> motocicletas;

    private HashMap<String, Camion> camiones;

    private HashMap<String, Bicicleta> bicicletas;

    public Concesionario() {
        coches = new HashSet<>();
        motocicletas = new ArrayList<>();
        camiones = new HashMap<>();
        bicicletas = new HashMap<>();
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas, HashMap<String, Camion> camiones,
                         HashMap<String, Bicicleta> bicicletas) {

        this.coches = coches;
        this.motocicletas = motocicletas;
        this.camiones = camiones;
        this.bicicletas = bicicletas;
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

    public HashMap<String, Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones(HashMap<String, Camion> camiones) {
        this.camiones = camiones;
    }

    public HashMap<String, Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(HashMap<String, Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
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

        if(!coches.contains(coche)){
            coches.add(coche);
        }

        return true;
    }

    public boolean removeCoche(Coche coche){

        if(coches.contains(coche)){
            coches.remove(coche);
        }

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

    public boolean addCamion(Camion camion){

        if(!camiones.containsValue(camion)){
            camiones.put(camion.getMatricula(), camion);
        }

        return true;
    }
    public boolean removeCamion(Camion camion){

        if(camiones.containsValue(camion)){
            camiones.remove(camion.getMatricula(), camion);
        }

        return true;
    }
    public Camion obtenerCamion(String matricula){

        if (camiones.containsKey(matricula)) {
            return camiones.get(matricula);
        }

        return null;
    }

    public float velocidadMediaCamiones(){
        float resultado = 0f;

        if(camiones.isEmpty()){
            return resultado;
        }

        for(Camion camion : camiones.values()){
            resultado+= camion.getVelocidad();
        }

        return resultado/camiones.size();
    }

    public boolean addBicicleta(Bicicleta bicicleta){
        if(!bicicletas.containsValue(bicicleta)){
            bicicletas.put(bicicleta.getMatricula(), bicicleta);
        }

        return true;
    }

    public boolean removeBicicleta(Bicicleta bicicleta){
        if(bicicletas.containsValue(bicicleta)){
            bicicletas.remove(bicicleta.getMatricula(), bicicleta);
        }

        return true;
    }

    public Bicicleta obtenerBicicleta(String matricula){
        if(bicicletas.containsKey(matricula)){
            return bicicletas.get(matricula);
        }

        return null;
    }

    public float velocidadMediaBicicletas(){
        float resultado=0f;

        if(bicicletas.isEmpty()){
            return resultado;
        }

        for(Bicicleta bicicleta : bicicletas.values()){
            resultado+=bicicleta.getVelocidad();
        }

        return resultado/bicicletas.size();
    }

    public float velocidadMediaVehiculos(){

        float resultado=0f;

        if(coches.isEmpty() && motocicletas.isEmpty()){
            return resultado;
        }

        resultado=velocidadMediaCoches()+velocidadMediaMotocicletas()+velocidadMediaCamiones()
                +velocidadMediaBicicletas();

        return resultado/2;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "coches=" + coches + ",\n" +
                " motocicletas=" + motocicletas + ",\n" +
                " camiones=" + camiones + ",\n" +
                " bicicletas=" + bicicletas +
                '}';
    }
}
