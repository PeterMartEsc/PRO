package es.ies.puerto.mapper.clasic;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class MapperAddress {

    public static CustomerDTO addressToCustomerDto(Address address) {
        CustomerDTO customerDTO = null;

        if (address == null) {
            return customerDTO;
        }
        customerDTO = new CustomerDTO();
        customerDTO.setAddress(address.getAddress());
        customerDTO.setCountry(address.getCountry());
        customerDTO.setZipCode(address.getZipCode());

        return customerDTO;
    }

    public static Address customerDtoToAdress(CustomerDTO customerDTO) {
        Address address = null;

        if (customerDTO == null) {
            return address;
        }

        address = new Address();
        address.setAddress(customerDTO.getAddress());
        address.setCountry(customerDTO.getCountry());
        address.setZipCode(customerDTO.getZipCode());

        return address;
    }
    public static AddressDTO addressTOAddressDTO(Address address) {
        if (address == null) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(address.getId());
        addressDTO.setZipCode(address.getZipCode());
        addressDTO.setCountry(address.getCountry());
        addressDTO.setAddress(address.getAddress());
        return addressDTO;
    }

    public static Address addressDTOTOAddress(AddressDTO addressDTO) {
        if (addressDTO == null) {
            return null;
        }

        Address address = new Address();
        address.setId(addressDTO.getId());
        address.setZipCode(addressDTO.getZipCode());
        address.setCountry(addressDTO.getCountry());
        address.setAddress(addressDTO.getAddress());
        return address;
    }







}
