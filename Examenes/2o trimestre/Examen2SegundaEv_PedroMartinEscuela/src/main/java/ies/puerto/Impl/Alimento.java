package ies.puerto.Impl;

import ies.puerto.Abstractas.ProductoFresco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimento extends ProductoFresco {

    public Alimento() {
        super();
    }

    public Alimento(String fechaCaducidad) {
        super(fechaCaducidad);
    }

    public Alimento(String id, String fechaCaducidad) {
        super(id, fechaCaducidad);
    }

    public Alimento(String nombre, float precio, String fechaEntrada, String id, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, id, fechaCaducidad);
    }

    @Override
    public int diasPreCaducidad() throws ParseException {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-aaaa");
        Date entrada = formatoFecha.parse(getFechaEntrada());

        Date caducidad = formatoFecha.parse(getFechaCaducidad());

        long diferencia = ((caducidad.getTime()-entrada.getTime()) / (1000L * 60 * 60 * 24));

        return (int) Math.abs(diferencia);
    }

    @Override
    public boolean verificarCaducidad() throws ParseException {

        if(diasPreCaducidad() <= 0){
            return true;
        }

        return false;
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.35f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "Nombre: " +getNombre()+
                "Precio: " +getPrecio()+
                "Fecha de caducidad: " +getFechaCaducidad()+
                "Identificador: " +getId()+
                "}";
    }
}
