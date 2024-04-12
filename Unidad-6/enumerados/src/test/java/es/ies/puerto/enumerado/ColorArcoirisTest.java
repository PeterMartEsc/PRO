package es.ies.puerto.enumerado;

import es.ies.puerto.utilities.UtilitiesTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColorArcoirisTest extends UtilitiesTest {
    EnumColorArcoiris colorArcoiris;

    @BeforeEach
    public void beforeEach(){
    }

    @Test
    public void colorArcoirisRojoTest(){

        colorArcoiris = EnumColorArcoiris.ROJO;
        Assertions.assertEquals(EnumColorArcoiris.ROJO, colorArcoiris, MESSAGE);
        Assertions.assertTrue(EnumColorArcoiris.ROJO.equals(colorArcoiris), MESSAGE);
    }

    @Test
    public void colorArcoirisAmarilloTest(){

        colorArcoiris = EnumColorArcoiris.AMARILLO;
        Assertions.assertEquals(EnumColorArcoiris.AMARILLO, colorArcoiris, MESSAGE);
        Assertions.assertTrue(EnumColorArcoiris.AMARILLO.equals(colorArcoiris), MESSAGE);
    }

    @Test
    public void colorArcoirisMiColorTest(){

        colorArcoiris = EnumColorArcoiris.valueOf("ROJO");
        Assertions.assertEquals(EnumColorArcoiris.ROJO, colorArcoiris, MESSAGE);
        Assertions.assertTrue(EnumColorArcoiris.ROJO.equals(colorArcoiris), MESSAGE);
       if(colorArcoiris == EnumColorArcoiris.AMARILLO){

       }
    }
}
