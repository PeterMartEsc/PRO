package es.ies.puerto.business;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.mapper.classic.MapperAddress;
import es.ies.puerto.mapper.classic.MapperCustomer;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class CustomerBusiness {

    public CustomerDTO obtenerCustomer(CustomerDTO customerDTO){
        if(customerDTO == null){
            return null;
        }

        Customer customer = MapperCustomer.CustomerDtoToCustomerEntity(customerDTO);
        Address address = MapperAddress.CustomerDtoToAdress(customerDTO);

        //Llammar a BBDD(Dao)

        CustomerDTO respuesta = MapperCustomer.CustomerEntityToCustomerDto(customer, address);

        return null;
    }

    public CustomerDTO obtenerCustomer(Long id){

        if(id == null){
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();
        return obtenerCustomer(customerDTO);
    }
}
