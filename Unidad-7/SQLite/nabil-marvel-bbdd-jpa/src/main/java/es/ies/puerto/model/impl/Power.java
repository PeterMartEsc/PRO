package es.ies.puerto.model.impl;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Poderes")
public class Power implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    int powerId;

    @Column(name = "poder")
    String power;
    @ManyToMany(mappedBy = "powers",cascade = CascadeType.ALL)
    Set<HeroCharacter> heroCharacters;

    /**
     * Default constructor of the class
     */
    public Power(){}

    /**
     * Constructor of the class
     * @param powerId identificator of a power
     */
    public Power(int powerId) {
        this.powerId = powerId;
    }

    /**
     * Constructor of the class
     * @param powerId identificator of a power
     * @param power name of a power
     */
    public Power(int powerId, String power) {
        this.powerId = powerId;
        this.power = power;
    }

    public Power(int powerId, String power, Set<HeroCharacter> heroCharacters) {
        this.powerId = powerId;
        this.power = power;
        this.heroCharacters = heroCharacters;
    }

    /**
     * Getters and setters
     */
    public int getPowerId() {
        return powerId;
    }

    public void setPowerId(int powerId) {
        this.powerId = powerId;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Set<HeroCharacter> getCharacters() {
        return heroCharacters;
    }

    public void setCharacters(Set<HeroCharacter> heroCharacters) {
        this.heroCharacters = heroCharacters;
    }


    @Override
    public String toString() {
        return "Power{" +
                "powerId=" + powerId +
                ", power='" + power + '\'' +
                ", heroCharacters=" + heroCharacters +
                '}';
    }

    /**
     * Method toString
     */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Power power = (Power) o;
        return powerId == power.powerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerId);
    }
}
