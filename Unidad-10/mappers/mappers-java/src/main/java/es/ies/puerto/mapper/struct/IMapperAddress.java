package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperAddress {

    IMapperAddress INSTANCE = Mappers.getMapper( IMapperAddress.class );

    @Mapping(target = "provincia",source = "isla")
    Address addressDTOTOAddress(AddressDTO addressDTO);


    @Mapping(target = "isla",source = "provincia")
    AddressDTO addressTOAddressDTO(Address address);


}
