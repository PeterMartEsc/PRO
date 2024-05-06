package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class MapperCustomer {

    public static Customer CustomerDtoToCustomerEntity(CustomerDTO customerDTO){
        Customer customer = null;
        if(customerDTO == null){
            //El customer es nulo
            return customer;
        }

        customer = new Customer();
        customer.setId(customerDTO.getId());

        //TODO: expresion regular para un espacio

        customer.setFirstname(customerDTO.getFullName());
        customer.setLastname(customerDTO.getFullName());
        //customer.setPassword(customerDTO.get);

        return customer;
    }

    public static CustomerDTO CustomerEntityToCustomerDto(Customer customer, Address address){
        CustomerDTO customerDTO = null;

        if(customer == null){
            //El customerDTO es nulo
            return customerDTO;
        }
        customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setFullName(customer.getFirstname()+ " " + customer.getLastname());

        if(address != null){
            customerDTO.setAddress(address.getAddress());
            customerDTO.setCountry(address.getCountry());
            customerDTO.setZipCode(address.getZipCode());
        }

        return customerDTO;
    }
}
