package es.ies.puerto.model.impl;

import es.ies.puerto.exception.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AliasTest extends Utilities {

    HeroCharacter heroCharacter;
    int id = 3;
    String name = "nameTesting";
    Alias alias = new Alias(3, new HeroCharacter(3), "aliasTest");

    public AliasTest() throws MyException {
    }

    @BeforeEach
    public void beforeEach(){
        heroCharacter = new HeroCharacter(id);
        alias = new Alias(id, heroCharacter, name);
    }

    @Test
    public void characterNotNull(){
        Assertions.assertNotNull(alias, MESSAGE_ERROR);
    }

    @Test
    public void setGetCharacter(){
        String aliasUpdate = "aliasUpdate";


        alias.setHeroCharacter(heroCharacter);
        alias.setAlias(aliasUpdate);


        Assertions.assertEquals(id, alias.getAliasId(), MESSAGE_ERROR);
        Assertions.assertEquals(aliasUpdate, alias.getAlias(), MESSAGE_ERROR);
        Assertions.assertEquals(heroCharacter, alias.getHeroCharacter(), MESSAGE_ERROR);

    }

    @Test
    public void equalsCharacterTest(){
        HeroCharacter heroCharacterFind = new HeroCharacter(id);
        Assertions.assertEquals(heroCharacterFind, heroCharacter, MESSAGE_ERROR);
    }

    @Test
    public void toStringCharacter(){
        Assertions.assertTrue(alias.toString().contains(alias.getAlias()),
                MESSAGE_ERROR);
        Assertions.assertTrue(alias.toString().contains(heroCharacter.toString()),
                MESSAGE_ERROR);
        Assertions.assertTrue(alias.toString().contains(String.valueOf(id)), MESSAGE_ERROR);
    }


    @Test
    public void hashCodeEqualsTest(){
        Alias heroCharacterEquals = new Alias(3);
        Alias heroCharacterNotEquals = new Alias(34);
        String str = "testing";
        Assertions.assertEquals(alias, heroCharacterEquals, MESSAGE_ERROR);
        Assertions.assertFalse(heroCharacter.equals(heroCharacterNotEquals), MESSAGE_ERROR);
        Assertions.assertFalse(heroCharacter.equals(str), MESSAGE_ERROR);
    }
}
