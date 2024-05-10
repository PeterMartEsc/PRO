package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(uses = IMapperAddress.class)
public interface IMappeCustomer {

    IMappeCustomer INSTANCE = Mappers.getMapper( IMappeCustomer.class );

    Customer customerDtoToCustomerEntity(CustomerDTO customerDTO);


    @Mapping(target = "address", source = "address")
    @Mapping(target = "id", source = "customer.id")
    @Mapping(target = "fullName", source = "customer",
            qualifiedByName = "transformarNombre")
    CustomerDTO customerToCustomerDTO(@Context Customer customer, Address address);

    @Named("transformarNombre")
    public static String crearNombre(Customer customer){
        return customer.getFirstname() + " " + customer.getLastname();
    }
}
