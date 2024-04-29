package es.ies.puerto.model.db.jdbc.interfaces;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.impl.HeroCharacter;

import java.util.Set;

public interface ICrudDb {
    public Set<HeroCharacter> obtain(String query) throws MyException ;
    public Set<HeroCharacter> obtainCharacters() throws MyException ;
    public HeroCharacter obtainCharacter(HeroCharacter heroCharacter) throws MyException ;
    public void addCharacter(HeroCharacter heroCharacter) throws MyException;
    public void removeCharacter(HeroCharacter heroCharacter) throws MyException ;
    public void updateCharacter(HeroCharacter heroCharacter) throws MyException ;
}
