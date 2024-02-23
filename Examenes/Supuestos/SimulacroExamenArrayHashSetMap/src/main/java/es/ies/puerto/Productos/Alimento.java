package es.ies.puerto.Productos;

import es.ies.puerto.Abstractas.ProductoAbstracta;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimento extends ProductoAbstracta {

    public Alimento(){
        super();
    }

    public Alimento(String udi) {
        super(udi);
    }

    public Alimento(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    //public int diasDisponible(){

        //SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-aaaa");

        //Date dateEntrada = formatoFecha.parse();

        //return 0;
    //}

    public boolean caducado(){

        return false;
    }

    @Override
    public float precioMaximo() {

        return getPrecio()*0.23f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "Alimentos{}";
    }
}
