package es.ies.puerto.model.impl;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name="Alias")
public class Alias implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int aliasId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personaje_id", nullable = false)
    private HeroCharacter heroCharacter;
    @Column(name = "alias", nullable = false)
    private String alias;

    /**
     * Default constructor of the class
     */
    public Alias (){}

    /**
     * Constructor of the class
     * @param aliasId of the heroCharacter's alias
     */
    public Alias(int aliasId) {
        this.aliasId = aliasId;
    }

    public Alias(int aliasId, HeroCharacter heroCharacter, String alias) {
        this.aliasId = aliasId;
        this.heroCharacter = heroCharacter;
        this.alias = alias;
    }

    /**
     * Getters and setters
     */
    public int getAliasId() {
        return aliasId;
    }

    public void setAliasId(int aliasId) {
        this.aliasId = aliasId;
    }

    public HeroCharacter getHeroCharacter() {
        return heroCharacter;
    }

    public void setHeroCharacter(HeroCharacter heroCharacter) {
        this.heroCharacter = heroCharacter;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Alias{" +
                "aliasId=" + aliasId +
                ", heroCharacter=" + heroCharacter +
                ", alias='" + alias + '\'' +
                '}';
    }

    /**
     * Method equals and hashcode
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return aliasId == alias.aliasId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliasId);
    }
}
