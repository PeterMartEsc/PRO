package es.ies.puerto.model.db.impl;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.jdbc.impl.OperationsDb;
import es.ies.puerto.model.db.jdbc.interfaces.ICrudDb;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.HeroCharacter;
import es.ies.puerto.model.impl.Power;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperationsDbTest extends Utilities {
    OperationsDb operationsDb;
    int id = 3;
    String name = "nameTesting";
    Alias alias = new Alias(3, new HeroCharacter(3), "aliasTest");
    String gender = "genderTest";
    Set<Power> powers;
    Power power1 = new Power(10, "powerTesting1");
    Power power2 = new Power(11, "powerTesting2");
    ICrudDb persistence;
    Set<HeroCharacter> heroCharacters;

    public OperationsDbTest() throws MyException {
    }

    @BeforeEach
    public void beforeEach() {
        try {
        persistence = new OperationsDb();
        heroCharacters = persistence.obtainCharacters();
        powers = new HashSet<>(Arrays.asList(power1, power2));
        } catch (MyException e) {
            Assertions.fail();
        }
    }

    @Test
    public void obtainCharactersTest() {
        Assertions.assertFalse(heroCharacters.isEmpty(), MESSAGE_ERROR);
        Assertions.assertEquals(2, heroCharacters.size(), MESSAGE_ERROR);
    }

    @Test
    public void obtainCharacterTest() throws MyException {
        HeroCharacter heroCharacterFind = new HeroCharacter(2);
        heroCharacterFind = persistence.obtainCharacter(heroCharacterFind);
        Alias aliasTest = new Alias(2,new HeroCharacter(2), "Peter Parker");
        Assertions.assertEquals(heroCharacterFind.getAlias(),aliasTest,
                MESSAGE_ERROR);
        Assertions.assertNotNull(heroCharacterFind.getName(),
                MESSAGE_ERROR);
        Assertions.assertFalse(heroCharacterFind.getPowers().isEmpty(), MESSAGE_ERROR);
        Assertions.assertNotNull(heroCharacterFind.getGender(),
                MESSAGE_ERROR);
    }

    @Test
    public void addDeleteCharacterTest() throws MyException {
        int originalSize = heroCharacters.size();
        HeroCharacter heroCharacterAdd = new HeroCharacter(id, name, gender, alias, powers);

        persistence.addCharacter(heroCharacterAdd);
        heroCharacters = persistence.obtainCharacters();

        Assertions.assertTrue(heroCharacters.contains(heroCharacterAdd), MESSAGE_ERROR);
        int updatedSize = heroCharacters.size();

        Assertions.assertEquals(originalSize + 1, updatedSize, MESSAGE_ERROR);

        persistence.removeCharacter(heroCharacterAdd);
        heroCharacters = persistence.obtainCharacters();
        updatedSize = heroCharacters.size();
        Assertions.assertEquals(originalSize, updatedSize, MESSAGE_ERROR);

        persistence.removeCharacter(heroCharacterAdd);
        heroCharacters = persistence.obtainCharacters();
        updatedSize = heroCharacters.size();
        Assertions.assertEquals(originalSize, updatedSize, MESSAGE_ERROR);
    }

    @Test
    public void updateCharacterTest() throws MyException {
        HeroCharacter heroCharacterAdd = new HeroCharacter(id, name, gender, alias, powers);
        persistence.addCharacter(heroCharacterAdd);
        heroCharacters = persistence.obtainCharacters();

        HeroCharacter heroCharacterFind = new HeroCharacter(heroCharacterAdd.getCharacterId());
        heroCharacterFind = persistence.obtainCharacter(heroCharacterFind);

        HeroCharacter heroCharacterUpdate = persistence.obtainCharacter(heroCharacterFind);

        heroCharacterUpdate.setName("nameUpdate");
        heroCharacterUpdate.setGender("genderUpdate");
        alias.setHeroCharacter(new HeroCharacter(3));
        alias.setAlias("aliasUpdate");
        heroCharacterUpdate.setAlias(alias);
        power1.setPower("powerUpdateTest1");
        Set<Power> powersUpdate = new HashSet<>();
        powersUpdate.add(power1);
        heroCharacterUpdate.setPowers(powersUpdate);

        persistence.updateCharacter(heroCharacterUpdate);

        heroCharacterFind = persistence.obtainCharacter(heroCharacterFind);
        Assertions.assertEquals(heroCharacterFind.toString(), heroCharacterUpdate.toString(),
                MESSAGE_ERROR);

        persistence.removeCharacter(heroCharacterUpdate);
    }

    @AfterEach
    public void afterEach() throws MyException {
        operationsDb = new OperationsDb();
        operationsDb.update(dropTablesQry);
        operationsDb.update(scriptBBDD);
    }
}
