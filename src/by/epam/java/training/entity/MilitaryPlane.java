/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Gun;
import by.epam.java.training.entity.component.Wing;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author niksk
 */
public class MilitaryPlane extends Plane implements Serializable{

    private static final long serialVersionUID = 1L;

    private Gun gun;

    public MilitaryPlane() {
        this.gun = new Gun();
    }

    public MilitaryPlane(String name, int crewMembers, double maxSpeed, int fuelConsumption, double distantion, Wing wing, Engine engine, Gun gun) {
        super(name, crewMembers, maxSpeed, fuelConsumption, distantion, wing, engine);
        this.gun = gun;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        MilitaryPlane militaryPlane = (MilitaryPlane) obj;

        if (!this.gun.equals(militaryPlane.gun)){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        hashCode += super.hashCode();
        hashCode += this.gun.hashCode();
        return hashCode;
    }

    public String getCharacteristics(){
        StringBuilder sb = new StringBuilder(super.getCharacteristics());
        sb.append(this.gun);
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(MilitaryPlane.class.getSimpleName());
        sb.append(":\n").append(getCharacteristics()).append("\n");
        return sb.toString();
    }
}
