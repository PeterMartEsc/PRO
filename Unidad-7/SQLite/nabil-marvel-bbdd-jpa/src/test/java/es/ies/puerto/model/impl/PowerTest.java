package es.ies.puerto.model.impl;

import es.ies.puerto.exception.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PowerTest extends Utilities {

    HeroCharacter heroCharacter;
    int id = 3;
    String name = "powerTesting1";
    Alias alias = new Alias(3, new HeroCharacter(3), "aliasTest");
    String gender = "genderTest";
    Set<HeroCharacter> heroCharacters;
    Set<Power> powers;
    Power power1;
    Power power2;

    public PowerTest() throws MyException {
    }

    @BeforeEach
    public void beforeEach(){
        power1 = new Power(3, "powerTesting1");
        power2 = new Power(2, "powerTesting2");
        powers = new HashSet<>(Arrays.asList(power1,power2));
        heroCharacter = new HeroCharacter(id, name,gender, alias, powers);
        heroCharacters = new HashSet<>(Arrays.asList(heroCharacter));
    }

    @Test
    public void characterNotNull(){
        Assertions.assertNotNull(power1, MESSAGE_ERROR);
    }

    @Test
    public void setGetCharacter(){
        String nameUpdate = "nameUpdate";
        power1.setPower(nameUpdate);
        power1.setCharacters(heroCharacters);

        Assertions.assertEquals(id, power1.getPowerId(), MESSAGE_ERROR);
        Assertions.assertEquals(nameUpdate, power1.getPower(), MESSAGE_ERROR);
        Assertions.assertEquals(heroCharacters, power1.getCharacters(), MESSAGE_ERROR);


    }

    @Test
    public void equalsCharacterTest(){
        Power powerFind = new Power(id);
        Assertions.assertEquals(powerFind, power1, MESSAGE_ERROR);
    }

    @Test
    public void toStringCharacter(){
        Assertions.assertTrue(power1.toString().contains(String.valueOf(id)),
                MESSAGE_ERROR);
        Assertions.assertTrue(power1.toString().contains(name),
                MESSAGE_ERROR);
    }


    @Test
    public void hashCodeEqualsTest(){
        Power powerEquals = new Power(3);
        Power powerNotEquals = new Power(34);
        String str = "testing";
        Assertions.assertEquals(power1, powerEquals, MESSAGE_ERROR);
        Assertions.assertFalse(power1.equals(powerNotEquals), MESSAGE_ERROR);
        Assertions.assertFalse(power1.equals(str), MESSAGE_ERROR);
    }
}
