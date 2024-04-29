package es.ies.puerto.model.db.jpa.hibernate.entities;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.jdbc.impl.OperationsDb;
import es.ies.puerto.model.db.jpa.hibernate.impl.OperationsHibernate;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.HeroCharacter;
import es.ies.puerto.model.impl.Power;
import org.junit.jupiter.api.*;
import utilities.Utilities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperationsHibernateTest extends Utilities {
    static EntityManagerFactory emf;
    static OperationsHibernate operationsHibernate;
    HeroCharacter heroCharacter;
    int id = 3;
    String name = "nameTesting";
    Alias alias;
    String gender = "genderTest";
    Set<Power> powers;
    Power power1;
    public OperationsHibernateTest() throws MyException {
    }

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        operationsHibernate = new OperationsHibernate(emf);

    }

    @BeforeEach
    public void initEntityManager() {
        powers = new HashSet<>();
        power1 = new Power(10, "powerTesting1");
        powers.add(power1);
        alias = new Alias(id, new HeroCharacter(id), "aliasTest");

        heroCharacter = new HeroCharacter(id);
        heroCharacter.setName(name);
        heroCharacter.setGender(gender);
        heroCharacter.setAlias(alias);
        heroCharacter.setPowers(powers);

        operationsHibernate.addCharacter(heroCharacter);
    }

    @Test
    public void findTest(){
        Assertions.assertNotNull(operationsHibernate.obtainCharacters(), MESSAGE_ERROR);

        HeroCharacter heroCharacterDB = operationsHibernate.obtainCharacterById(heroCharacter.getCharacterId());
        Assertions.assertEquals(heroCharacter.getName(), heroCharacterDB.getName(), MESSAGE_ERROR);
    }
    @Test
    public void updateRemoveTest(){
        heroCharacter.setName("nameTesting2");
        heroCharacter.setGender("genderTesting2");

        operationsHibernate.updateCharacter(heroCharacter);
        HeroCharacter heroCharacterDBUpdate = operationsHibernate.obtainCharacterById(heroCharacter.getCharacterId());
        Assertions.assertEquals(heroCharacter.getName(), heroCharacterDBUpdate.getName(), MESSAGE_ERROR);
        Assertions.assertEquals(heroCharacter.getGender(), heroCharacterDBUpdate.getGender(), MESSAGE_ERROR);

        operationsHibernate.removeCharacter(heroCharacter);
        Assertions.assertNull(operationsHibernate.obtainCharacter(heroCharacter), MESSAGE_ERROR);
    }

    @AfterEach
    public void afterEach() throws MyException {
        dropTablesCreate();
    }

   @AfterAll
    public static void afterAll() {
        emf.close();
    }
}
