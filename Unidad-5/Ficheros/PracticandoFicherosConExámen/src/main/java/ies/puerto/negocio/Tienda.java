package ies.puerto.negocio;


import ies.puerto.modelo.impl.Alimento;
import ies.puerto.modelo.impl.Aparato;
import ies.puerto.modelo.impl.CuidadoPersonal;
import ies.puerto.modelo.impl.Souvenir;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Tienda {

    private ArrayList<Alimento> alimentos;

    private ArrayList<Aparato> aparatos;

    private HashMap<String, Souvenir> souvenirs;

    private HashSet<CuidadoPersonal> cuidadosPersonales;

    public Tienda(){
        alimentos = new ArrayList<>();
        aparatos = new ArrayList<>();
        souvenirs = new HashMap<>();
        cuidadosPersonales = new HashSet<>();
    }

    public Tienda(ArrayList<Alimento> alimentos, ArrayList<Aparato> aparatos, HashMap<String, Souvenir> souvenirs,
                  HashSet<CuidadoPersonal> cuidadosPersonales) {
        this.alimentos = alimentos;
        this.aparatos = aparatos;
        this.souvenirs = souvenirs;
        this.cuidadosPersonales = cuidadosPersonales;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public ArrayList<Aparato> getAparatos() {
        return aparatos;
    }

    public void setAparatos(ArrayList<Aparato> aparatos) {
        this.aparatos = aparatos;
    }

    public HashMap<String, Souvenir> getSouvenirs() {
        return souvenirs;
    }

    public void setSouvenirs(HashMap<String, Souvenir> souvenirs) {
        this.souvenirs = souvenirs;
    }

    public HashSet<CuidadoPersonal> getCuidadosPersonales() {
        return cuidadosPersonales;
    }

    public void setCuidadosPersonales(HashSet<CuidadoPersonal> cuidadosPersonales) {
        this.cuidadosPersonales = cuidadosPersonales;
    }

    public boolean addAlimento(Alimento alimento){

        if(!alimentos.contains(alimento)){
            return alimentos.add(alimento);
        }

        return true;
    }

    public boolean removeAlimento(Alimento alimento){

        if(alimentos.contains(alimento)){
            return alimentos.remove(alimento);
        }
        return true;
    }

    public Alimento obtenerAlimento(String id){

        Alimento alimento = new Alimento(id);

        if(alimentos.isEmpty()){
            return null;
        }

        for(Alimento alimento1 : alimentos){
            if(alimento1.equals(alimento)){
                return alimento;
            }
        }
        return null;
    }

    public boolean addAparato(Aparato aparato){

        if(!aparatos.contains(aparato)){
            return aparatos.add(aparato);
        }

        return true;
    }

    public boolean removeAparato(Aparato aparato){

        if(aparatos.contains(aparato)){
            return aparatos.remove(aparato);
        }
        return true;
    }

    public Aparato obtenerAparato(String id){

        Aparato aparato = new Aparato(id);

        if(aparatos.isEmpty()){
            return null;
        }

        for(Aparato aparato1 : aparatos){
            if(aparato1.equals(aparato)){
                return aparato;
            }
        }
        return null;
    }

    public boolean addSouvenir(Souvenir souvenir){

        if(!souvenirs.containsValue(souvenir)){
            souvenirs.put(souvenir.getId(), souvenir);
        }

        return true;
    }

    public boolean removeSouvenir(Souvenir souvenir){

        if(souvenirs.containsValue(souvenir)){
            souvenirs.remove(souvenir.getId(), souvenir);
        }
        return true;
    }

    public Souvenir obtenerSouvenir(String id){

        Souvenir souvenir = new Souvenir(id);

        if(souvenirs.isEmpty()){
            return null;
        }

        if(souvenirs.containsKey(id)){
            return souvenir;
        }

        return null;
    }

    public boolean addCuidadoPersonal(CuidadoPersonal cuidadoPersonal){

        if(!cuidadosPersonales.contains(cuidadoPersonal)){
            return cuidadosPersonales.add(cuidadoPersonal);
        }

        return true;
    }

    public boolean removeCuidadoPersonal(CuidadoPersonal cuidadoPersonal){

        if(cuidadosPersonales.contains(cuidadoPersonal)){
            return cuidadosPersonales.remove(cuidadoPersonal);
        }
        return true;
    }

    public CuidadoPersonal obtenerCuidadoPersonal(String nombre){

        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(nombre);

        if(cuidadosPersonales.isEmpty()){
            return null;
        }

        for(CuidadoPersonal cuidadoPersonal1 : cuidadosPersonales){
            if(cuidadoPersonal1.equals(cuidadoPersonal)){
                return cuidadoPersonal;
            }
        }
        return null;
    }

    public float precioTotalAlimentos() throws ParseException {

        float resultado = 0f;

        if(alimentos.isEmpty()){
            return resultado;
        }

        for(Alimento alimento : alimentos){
            if(!alimento.verificarCaducidad()){
                resultado += alimento.getPrecio();
            }

        }

        return resultado;
    }

    public float precioTotalAparatos(){
        float resultado = 0f;

        if(aparatos.isEmpty()){
            return resultado;
        }

        for(Aparato aparato : aparatos){
            resultado += aparato.getPrecio();
        }

        return resultado;
    }

    public float precioTotalSouvenirs(){
        float resultado = 0f;

        if(souvenirs.isEmpty()){
            return resultado;
        }

        for(Souvenir souvenir : souvenirs.values()){
            resultado += souvenir.getPrecio();
        }

        return resultado;
    }

    public float precioTotalCuidadoPersonal(){
        float resultado = 0f;

        if(cuidadosPersonales.isEmpty()){
            return resultado;
        }

        for(CuidadoPersonal cuidadoPersonal : cuidadosPersonales){
            resultado += cuidadoPersonal.getPrecio();
        }

        return resultado;
    }

    public float precioTotalTienda() throws ParseException {
        float resultado = 0f;

        return resultado = precioTotalAlimentos()+precioTotalAparatos()+precioTotalSouvenirs()
                +precioTotalCuidadoPersonal();
    }

    public int cantidadAlimentos() throws ParseException {

        int contador =0;

        if(alimentos.isEmpty()){
            return contador;
        }

        for(Alimento alimento1 : alimentos){

            if(!alimento1.verificarCaducidad()){
                contador ++;
            }
        }

        return contador;
    }

    public int cantidadAparatos() {

        int contador =0;

        if(aparatos.isEmpty()){
            return contador;
        }

        for(Aparato aparato : aparatos){
            contador++;
        }

        return contador;
    }

    public int cantidadSouvenirs() {

        int contador =0;

        if(souvenirs.isEmpty()){
            return contador;
        }

        for(Souvenir souvenir : souvenirs.values()){
            contador++;
        }

        return contador;
    }

    public int cantidadCuidadoPersonal() {

        int contador =0;

        if(cuidadosPersonales.isEmpty()){
            return 0;
        }

        for(CuidadoPersonal cuidadoPersonal : cuidadosPersonales){
            contador++;
        }

        return contador;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "alimentos=" + alimentos +
                ", aparatos=" + aparatos +
                ", souvenirs=" + souvenirs +
                ", cuidadosPersonales=" + cuidadosPersonales +
                '}';
    }
}
