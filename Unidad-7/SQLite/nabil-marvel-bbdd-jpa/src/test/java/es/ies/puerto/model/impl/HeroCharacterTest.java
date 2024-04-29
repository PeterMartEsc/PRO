package es.ies.puerto.model.impl;

import es.ies.puerto.exception.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HeroCharacterTest extends Utilities {

    HeroCharacter heroCharacter;
    int id = 3;
    String name = "nameTesting";
    Alias alias = new Alias(3, new HeroCharacter(3), "aliasTest");
    String gender = "genderTest";
    Set<Power> powers;
    Power power1 = new Power(1, "powerTesting1");
    Power power2 = new Power(2, "powerTesting2");

    public HeroCharacterTest() throws MyException {
    }

    @BeforeEach
    public void beforeEach(){
        powers = new HashSet<>(Arrays.asList(power1,power2));
        heroCharacter = new HeroCharacter(id, name,gender, alias, powers);
    }

    @Test
    public void characterNotNull(){
        Assertions.assertNotNull(heroCharacter, MESSAGE_ERROR);
    }

    @Test
    public void setGetCharacter(){
        String nameUpdate = "nameUpdate";
        String genderUpdate = "genderUpdate";
        Alias aliasUpdate = new Alias(4,new HeroCharacter(3),"aliasTest2");
        Power power = new Power(3, "powerTesting3");
        Set<Power> powersUpdate = new HashSet<>();
        powersUpdate.add(power);

        heroCharacter.setName(nameUpdate);
        heroCharacter.setGender(genderUpdate);
        heroCharacter.setPowers(powersUpdate);

        Assertions.assertEquals(id, heroCharacter.getCharacterId(), MESSAGE_ERROR);
        Assertions.assertEquals(alias, heroCharacter.getAlias(), MESSAGE_ERROR);
        Assertions.assertEquals(nameUpdate, heroCharacter.getName(), MESSAGE_ERROR);
        Assertions.assertEquals(genderUpdate, heroCharacter.getGender(), MESSAGE_ERROR);
        Assertions.assertEquals(powersUpdate, heroCharacter.getPowers(), MESSAGE_ERROR);

    }

    @Test
    public void equalsCharacterTest(){
        HeroCharacter heroCharacterFind = new HeroCharacter(id);
        Assertions.assertEquals(heroCharacterFind, heroCharacter, MESSAGE_ERROR);
    }

    @Test
    public void toStringCharacter(){
        Assertions.assertTrue(heroCharacter.toString().contains(alias.toString()),
                MESSAGE_ERROR);
        Assertions.assertTrue(heroCharacter.toString().contains(name),
                MESSAGE_ERROR);
        Assertions.assertTrue(heroCharacter.toString().contains(gender),
                MESSAGE_ERROR);
        Assertions.assertTrue(heroCharacter.toString().contains(String.valueOf(powers)), MESSAGE_ERROR);
    }


    @Test
    public void hashCodeEqualsTest(){
        HeroCharacter heroCharacterEquals = new HeroCharacter(3);
        HeroCharacter heroCharacterNotEquals = new HeroCharacter(34);
        String characterStr = "testing";
        Assertions.assertEquals(heroCharacter, heroCharacterEquals, MESSAGE_ERROR);
        Assertions.assertFalse(heroCharacter.equals(heroCharacterNotEquals), MESSAGE_ERROR);
        Assertions.assertFalse(heroCharacter.equals(characterStr), MESSAGE_ERROR);
    }
}
