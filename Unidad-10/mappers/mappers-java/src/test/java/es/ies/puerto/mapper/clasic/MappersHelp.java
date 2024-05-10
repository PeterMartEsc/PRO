package es.ies.puerto.mapper.clasic;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.BeforeEach;

public class MappersHelp {
    public static final String MI_DIRECCION = "Mi direccion";
    public static final String MI_PAIS = "Mi pais";
    public static final String CODIGO = "codigo";

    public static final String PROVINCIA_ISLA = "San Borondon";


    public static final Long ID_ADDRESS = new Long(1);
    public Address addressEntity;
    public AddressDTO addressDTO;

    @BeforeEach
    public void beforeEach() {
        addressDTO = new AddressDTO();
        addressDTO.setAddress(MI_DIRECCION);
        addressDTO.setCountry(MI_PAIS);
        addressDTO.setId(ID_ADDRESS);
        addressDTO.setZipCode(CODIGO);
        addressDTO.setIsla(PROVINCIA_ISLA);
        addressEntity = new Address();
        addressEntity.setAddress(MI_DIRECCION);
        addressEntity.setCountry(MI_PAIS);
        addressEntity.setId(ID_ADDRESS);
        addressEntity.setZipCode(CODIGO);
        addressEntity.setProvincia(PROVINCIA_ISLA);

    }
}
