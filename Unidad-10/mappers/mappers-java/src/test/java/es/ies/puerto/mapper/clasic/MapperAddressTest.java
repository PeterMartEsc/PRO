package es.ies.puerto.mapper.clasic;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MapperAddressTest extends MappersHelp {

    AddressDTO addressDTOMappper;
    Address addressEntityMapper;


    @Test
    public void addressTOAddressDTOTest() {
        addressDTOMappper = MapperAddress.addressTOAddressDTO(addressEntity);
        Assertions.assertEquals(addressDTO.getId(),addressDTOMappper.getId());
        Assertions.assertEquals(addressDTO.getAddress(),addressDTOMappper.getAddress());
        Assertions.assertEquals(addressDTO.getCountry(),addressDTOMappper.getCountry());
        Assertions.assertEquals(addressDTO.getZipCode(),addressDTOMappper.getZipCode());
    }

    @Test
    public void addressDtoTOAddressTest() {
        addressEntityMapper = MapperAddress.addressDTOTOAddress(addressDTO);
        Assertions.assertEquals(addressEntity.getId(),addressEntityMapper.getId());
        Assertions.assertEquals(addressEntity.getAddress(),addressEntityMapper.getAddress());
        Assertions.assertEquals(addressEntity.getCountry(),addressEntityMapper.getCountry());
        Assertions.assertEquals(addressEntity.getZipCode(),addressEntityMapper.getZipCode());
    }



}
