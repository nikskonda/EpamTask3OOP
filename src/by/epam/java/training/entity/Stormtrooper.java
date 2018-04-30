/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author niksk
 */
public class Stormtrooper extends MilitaryPlane implements Serializable {

    private static final long serialVersionUID = 1L;

    private int numberOfMachineGuns;
    private int numberOfMissiles;

    public Stormtrooper() {
    }

    public Stormtrooper(int numberOfMachineGuns, int numberOfMissiles) {
        this.numberOfMachineGuns = numberOfMachineGuns;
        this.numberOfMissiles = numberOfMissiles;
    }

    public int getNumberOfMachineGuns() {
        return numberOfMachineGuns;
    }

    public void setNumberOfMachineGuns(int numberOfMachineGuns) {
        this.numberOfMachineGuns = numberOfMachineGuns;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Stormtrooper that = (Stormtrooper) o;
        return numberOfMachineGuns == that.numberOfMachineGuns &&
                numberOfMissiles == that.numberOfMissiles;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), numberOfMachineGuns, numberOfMissiles);
    }
}
