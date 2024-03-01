package es.ies.puerto.negocio;

import es.ies.puerto.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.abstractas.ProductoAbstract;
import es.ies.puerto.negocio.interfaces.ITiendaInterface;

import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITiendaInterface {

    ICrudOperaciones persistencia;

    List<ProductoAbstract> alimentos;

    public Tienda() {
        alimentos = new ArrayList<>();
    }

    public boolean existeProducto(ProductoAbstract productoAbstract) {
        return alimentos.contains(productoAbstract);
    }

    @Override
    public boolean crearProducto(ProductoAbstract productoAbstract) {

        if(!existeProducto(productoAbstract)){
            return alimentos.add(productoAbstract);
        }

        return false;
    }

    @Override
    public boolean eliminarProducto(ProductoAbstract productoAbstract) {
        return alimentos.remove(productoAbstract);
    }

    @Override
    public List<ProductoAbstract> obtenerProductos() {
        return alimentos;
    }

    @Override
    public ProductoAbstract obtenerProducto(ProductoAbstract productoAbstract) {

        if(existeProducto(productoAbstract)){
            int posicion = alimentos.indexOf(productoAbstract);
            return alimentos.get(posicion);
        }

        return null;
    }

    @Override
    public boolean actualizarProducto(ProductoAbstract productoAbstract) {
        if(existeProducto(productoAbstract)){
            int posicion = alimentos.indexOf(productoAbstract);
            //alimentos.remove(posicion);
            //alimentos.add(posicion, productoAbstract);
            alimentos.set(posicion, productoAbstract);
            return true;
        }
        return false;
    }

    //public void ordenarProducto (ArrayList<ProductoAbstract> listaOrdenar){
      //  Collections.sort(alimentos);
    //}
}
