package ies.puerto.PrimeraParte.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class RegistroCliente {

    private List<Cliente> listaClientes;

    public RegistroCliente(){
        listaClientes = new ArrayList<>();
    }

    public RegistroCliente(List<Cliente> clientes){
        this.listaClientes = clientes;
    }

    public Cliente buscarCliente(String numeroCliente){

        Cliente clienteBuscar = new Cliente("", numeroCliente);

        return buscarCliente(clienteBuscar);

        //for(Cliente cliente:listaClientes){
          //  if(numeroCliente == cliente.getNumero()){
           //     return cliente;
            //}
        //}
    }

    public Cliente buscarCliente(Cliente cliente){

        for (Cliente clienteLista : listaClientes){
            if(cliente.equals(clienteLista)){
                return clienteLista;
            }
        }

        return null;
    }

    public void addCliente(Cliente cliente){

        if(!listaClientes.contains(cliente)){
            listaClientes.add(cliente);
        }
    }

    public void transaccion(String numeroCliente, float cantidad){

        Cliente clienteActualizar = new Cliente(numeroCliente);

        if(!listaClientes.contains(clienteActualizar)){
            return;
        }

        int posicionCliente = listaClientes.indexOf(clienteActualizar);

        clienteActualizar = buscarCliente(clienteActualizar);

        clienteActualizar.actualizarSaldo(cantidad);

        listaClientes.add(posicionCliente, clienteActualizar);
    }
}
