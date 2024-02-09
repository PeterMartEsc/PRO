package es.ies.puerto.Impl;

import es.ies.puerto.Abstractas.ProductoAbstract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Alimento extends ProductoAbstract {

    public Alimento() {
    }

    public Alimento(String udi) {
        super(udi);
    }

    public Alimento(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    public int diasDisponible() throws ParseException {

        SimpleDateFormat nuevoFormato = new SimpleDateFormat("dd-MM-aaaa");
        Date entrada = nuevoFormato.parse(getFechaEntrada());

        Date fechaActualSinFormato = new Date();
        Date fechaActual = nuevoFormato.parse(nuevoFormato.format(fechaActualSinFormato));

        long diferencia = ((entrada.getTime()-fechaActual.getTime()) / (1000L * 60 * 60 * 24));

        return (int) Math.abs(diferencia);
    }

    public boolean caducado() throws ParseException {

        if(diasDisponible() > 30){
            return true;
        }
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
        return "Alimento{" +
                "Nombre: " +getNombre() +
                "Precio: " +getPrecio() +
                "Fecha de entrada: " +getFechaEntrada()+
                "Udi: " +getUdi()+ "}";
    }
}
