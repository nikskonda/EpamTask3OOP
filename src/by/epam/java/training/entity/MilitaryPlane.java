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
public class MilitaryPlane extends Plane{

    private static final long serialVersionUID = 1L;

    private Gun gun;

    public MilitaryPlane() {
    }

    public MilitaryPlane(String name, int crewMembers, double maxSpeedInKPH, double weightInKG, double massOfFuelInKG, Wing wing, List<Engine> engines, Gun gun) {
        super(name, crewMembers, maxSpeedInKPH, weightInKG, massOfFuelInKG, wing, engines);
        this.gun = gun;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return Objects.equals(gun, that.gun);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), gun);
    }
}
