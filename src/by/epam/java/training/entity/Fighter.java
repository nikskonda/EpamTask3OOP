/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Gun;
import by.epam.java.training.entity.component.Wing;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author niksk
 */
public class Fighter extends MilitaryPlane{

    private static final long serialVersionUID = 1L;

    private int numberOfBombs;

    public Fighter() {
    }

    public Fighter(String name, int crewMembers, double maxSpeedInKPH, double weightInKG, double massOfFuelInKG, Wing wing, List<Engine> engines, Gun gun, int numberOfBombs) {
        super(name, crewMembers, maxSpeedInKPH, weightInKG, massOfFuelInKG, wing, engines, gun);
        this.numberOfBombs = numberOfBombs;
    }

    public int getNumberOfBombs() {
        return numberOfBombs;
    }

    public void setNumberOfBombs(int numberOfBombs) {
        this.numberOfBombs = numberOfBombs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fighter fighter = (Fighter) o;
        return numberOfBombs == fighter.numberOfBombs;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), numberOfBombs);
    }
}
