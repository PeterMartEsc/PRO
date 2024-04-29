package es.ies.puerto.model.db.jdbc.impl;
import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.jdbc.abstracts.OperationsDbAbstracts;
import es.ies.puerto.model.db.jdbc.interfaces.ICrudDb;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.HeroCharacter;
import es.ies.puerto.model.impl.Power;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class OperationsDb extends OperationsDbAbstracts implements ICrudDb {
    public OperationsDb() throws MyException {
    }
    @Override
    public Set<HeroCharacter> obtain(String sql) throws MyException {
        Set<HeroCharacter> heroCharacters = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConnection().createStatement();
            rs = statement.executeQuery(sql);
            heroCharacters = new HashSet<>();
            while (rs.next()) {
                heroCharacters.add(buildCharacter(rs));
            }
        } catch (Exception e) {
            throw new MyException(e.getMessage(), e);
        }finally{
            closeResources(statement, rs);
        }
        return heroCharacters;
    }

    /**
     * Method that obtains the powers of a character in the database
     * @param rs of the sqlite query
     * @throws MyException
     */
    public Set<Power> obtainPowers (ResultSet rs) throws MyException {
        Set<Power> powers = null;
        try {
            powers = new HashSet<>();

                int powerId = rs.getInt("poder_id");
                String powerName = rs.getString("poder");
                Power power = new Power(powerId, powerName);
                powers.add(power);

        } catch (SQLException exception) {
            throw new MyException(exception.getMessage(), exception);
        }
        return powers;
    }

    /**
     * Method that obtains the alias of a character in the database
     * @param rs of the sqlite query
     * @throws MyException
     */
    public Alias obtainAlias (ResultSet rs) throws MyException{
        Alias alias = null;
        try {
            alias = new Alias();
                    int aliasId = rs.getInt("alias_id");
                    int characterId = rs.getInt("personaje_id");
                    String aliasName = rs.getString("alias");
                    alias = new Alias(aliasId, new HeroCharacter(characterId), aliasName);

        } catch (SQLException exception) {
            throw new MyException(exception.getMessage(), exception);
        }
        return alias;
    }
    /**
     * Method that builds an object from the class HeroCharacter
     * @param rs of the query
     * @throws MyException
     */
    public HeroCharacter buildCharacter(ResultSet rs) throws SQLException, MyException {
        int id = rs.getInt("personaje_id");
        String name = rs.getString("nombre_personaje");
        String gender = rs.getString("genero");
        Alias alias = obtainAlias(rs);
        Set<Power> powers = obtainPowers(rs);
        return new HeroCharacter(id, name, gender,alias, powers);
    }
    @Override
    public Set<HeroCharacter> obtainCharacters() throws MyException {
        String qry = "SELECT ch.id AS personaje_id, ch.nombre AS nombre_personaje, ch.genero, " +
                "a.id AS alias_id, a.alias, " +
                "p.id AS poder_id, p.poder " +
                "FROM Personajes AS ch " +
                "JOIN Alias AS a ON ch.id = a.personaje_id " +
                "JOIN Personajes_Poderes AS chp ON ch.id = chp.personaje_id " +
                "JOIN Poderes AS p ON chp.poder_id = p.id";
        return obtain(qry);
    }
    @Override
    public HeroCharacter obtainCharacter(HeroCharacter heroCharacter) throws MyException {
        String qry = "SELECT ch.id AS personaje_id, ch.nombre AS nombre_personaje, ch.genero, " +
                "a.id AS alias_id, a.alias, " +
                "p.id AS poder_id, p.poder " +
                "FROM Personajes AS ch " +
                "JOIN Alias AS a ON ch.id = a.personaje_id " +
                "JOIN Personajes_Poderes AS chp ON ch.id = chp.personaje_id " +
                "JOIN Poderes AS p ON chp.poder_id = p.id "+
                "WHERE ch.id="+ heroCharacter.getCharacterId();
        return obtain(qry).iterator().next();
    }
    @Override
    public void addCharacter(HeroCharacter heroCharacter) throws MyException {
        String qryCharacter = "INSERT INTO Personajes(id, nombre, genero) " +
                "VALUES ("+ heroCharacter.getCharacterId()+ ", '"+ heroCharacter.getName()+
                "', '"+ heroCharacter.getGender()+"')";
        update(qryCharacter);
        addPowers(heroCharacter);
        addAlias(heroCharacter);
        addCharactersPowers(heroCharacter);
    }

    /**
     * Method that adds the powers of a heroCharacter in the database
     * @param heroCharacter to add its powers
     * @throws MyException
     */
    public void addPowers(HeroCharacter heroCharacter) throws MyException{
        for (Power power : heroCharacter.getPowers()){
            String qryPowers = "INSERT INTO Poderes(id, poder)" +
                    "VALUES ("+ power.getPowerId()+", '"+power.getPower()+"')";
            update(qryPowers);
        }
    }

    /**
     * Method that adds the alias of a heroCharacter in the database
     * @param heroCharacter to add its alias
     * @throws MyException
     */
    public void addAlias(HeroCharacter heroCharacter) throws MyException{
        String qry = "INSERT INTO Alias(id, personaje_id, alias) VALUES ("+ heroCharacter.getAlias().getAliasId()+", "
                + heroCharacter.getAlias().getHeroCharacter().getCharacterId()+", '"+ heroCharacter.getAlias().getAlias()+"')";
        update(qry);
    }

    /**
     * Method that adds the powers of a heroCharacter in the database
     * @param heroCharacter to add its powers
     * @throws MyException
     */
    public void addCharactersPowers(HeroCharacter heroCharacter) throws MyException{
        for (Power power: heroCharacter.getPowers()) {
            String qryCharPowers = "INSERT INTO Personajes_Poderes(personaje_id, poder_id) VALUES (" +
                    heroCharacter.getCharacterId() + ", " + power.getPowerId() + ")";
            update(qryCharPowers);
        }
    }

    @Override
    public void removeCharacter(HeroCharacter heroCharacter) throws MyException {
        String qry = "DELETE FROM Personajes WHERE id="+ heroCharacter.getCharacterId();
        update(qry);
        removePowers(heroCharacter);
        removeCharactersPowers(heroCharacter);
        removeAlias(heroCharacter);
    }

    /**
     * Method that remove the powers of a heroCharacter in the database
     * @param heroCharacter to remove its powers
     * @throws MyException
     */
    public void removePowers(HeroCharacter heroCharacter) throws MyException{
        for (Power power: heroCharacter.getPowers()) {
            String qryCharPowers = "DELETE FROM Poderes WHERE id=" + power.getPowerId();
            update(qryCharPowers);
        }
    }

    /**
     * Method that removes the alias of a heroCharacter in the database
     * @param heroCharacter to remove its alias
     * @throws MyException
     */
    public void removeAlias(HeroCharacter heroCharacter) throws MyException{
        String qry = "DELETE FROM Alias WHERE personaje_id="+ heroCharacter.getCharacterId();
        update(qry);
    }

    public void removeCharactersPowers(HeroCharacter heroCharacter) throws MyException{
        String qryCharacterPowers = "DELETE FROM Personajes_Poderes WHERE personaje_id="+ heroCharacter.getCharacterId();
        update(qryCharacterPowers);
    }

    @Override
    public void updateCharacter(HeroCharacter heroCharacter) throws MyException {
        String qry = "UPDATE Personajes SET nombre='"+ heroCharacter.getName()+
                "', genero='"+ heroCharacter.getGender()+ "' WHERE id="+ heroCharacter.getCharacterId();
        update(qry);
        updatePowers(heroCharacter);
        updateAlias(heroCharacter);
        updateCharacterPowers(heroCharacter);
    }

    /**
     * Method that updates the powers of a heroCharacter in the database
     * @param heroCharacter to update its powers
     * @throws MyException
     */
    public void updatePowers(HeroCharacter heroCharacter) throws MyException {
        for (Power power: heroCharacter.getPowers()) {
            String qryPowers = "UPDATE Poderes SET " +
                    "poder='"+power.getPower()+"' " +
                    "WHERE id="+power.getPowerId()+";";
            update(qryPowers);
        }
    }
    /**
     * Method that updates the alias of a heroCharacter in the database
     * @param heroCharacter to update its alias
     * @throws MyException
     */
    public void updateAlias(HeroCharacter heroCharacter) throws MyException {
        String qryAlias = "UPDATE Alias SET alias='"+ heroCharacter.getAlias().getAlias() + "' " +
                "WHERE id="+ heroCharacter.getAlias().getAliasId();
        update(qryAlias);
    }

    /**
     * Method that updates the id of the powers from a heroCharacter in the database
     * @param heroCharacter to update in table Personajes_Poderes
     * @throws MyException
     */

    public void updateCharacterPowers(HeroCharacter heroCharacter) throws MyException {
        for (Power power : heroCharacter.getPowers()) {
            String qryChrPowers = "REPLACE INTO Personajes_Poderes (personaje_id, poder_id) VALUES " +
                    "("+ heroCharacter.getCharacterId()+", "+power.getPowerId()+ ")";
            update(qryChrPowers);
        }
    }

}
