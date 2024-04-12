package es.ies.puerto.enumerado;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    EnumTipoVehiculo tipoVehiculo;
    @Test
    public void vehiculoBiciTest(){
        tipoVehiculo = EnumTipoVehiculo.BICICLETA;
        System.out.println(tipoVehiculo.getTipo());
    }
}
