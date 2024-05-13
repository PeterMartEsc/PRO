package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.mapper.clasic.MapperAddress;
import es.ies.puerto.mapper.clasic.MappersHelp;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAddressTest extends MappersHelp {

    AddressDTO addressDTOMappper;
    Address addressEntityMapper;


    @Test
    public void addressTOAddressDTOTest() {
        addressDTOMappper = IMapperAddress.INSTANCE.addressTOAddressDTO(addressEntity);
        Assertions.assertEquals(addressDTO.getId(),addressDTOMappper.getId());
        Assertions.assertEquals(addressDTO.getAddress(),addressDTOMappper.getAddress());
        Assertions.assertEquals(addressDTO.getCountry(),addressDTOMappper.getCountry());
        Assertions.assertEquals(addressDTO.getZipCode(),addressDTOMappper.getZipCode());
        Assertions.assertEquals(addressDTO.getIsla(),addressDTOMappper.getIsla());

    }

    @Test
    public void addressDtoTOAddressTest() {
        addressEntityMapper = IMapperAddress.INSTANCE.addressDTOTOAddress(addressDTO);
        Assertions.assertEquals(addressEntity.getId(),addressEntityMapper.getId());
        Assertions.assertEquals(addressEntity.getAddress(),addressEntityMapper.getAddress());
        Assertions.assertEquals(addressEntity.getCountry(),addressEntityMapper.getCountry());
        Assertions.assertEquals(addressEntity.getZipCode(),addressEntityMapper.getZipCode());
        Assertions.assertEquals(addressEntity.getProvincia(),addressEntityMapper.getProvincia());

    }



}
