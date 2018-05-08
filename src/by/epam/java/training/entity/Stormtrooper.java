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

/**
 *
 * @author niksk
 */
public class Stormtrooper extends MilitaryPlane implements Serializable {

    private static final long serialVersionUID = 1L;

    private int numberOfBombs;

    public Stormtrooper() {
    }

    public Stormtrooper(String name, int crewMembers, double maxSpeed, int fuelConsumption, double distantion, Wing wing, Engine engine, Gun gun, int numberOfBombs) {
        super(name, crewMembers, maxSpeed, fuelConsumption, distantion, wing, engine, gun);
        this.numberOfBombs = numberOfBombs;
    }

    public int getNumberOfBombs() {
        return numberOfBombs;
    }

    public void setNumberOfBombs(int numberOfBombs) {
        this.numberOfBombs = numberOfBombs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Stormtrooper fighter = (Stormtrooper) obj;
        if (this.numberOfBombs != fighter.numberOfBombs){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = super.hashCode();
        hashCode = prime * hashCode + this.numberOfBombs;
        return hashCode;
    }

    public String getCharacteristics(){
        StringBuilder sb = new StringBuilder(super.getCharacteristics());
        sb.append("Bombs=").append(this.numberOfBombs).append("\n");
        return sb.toString();
    }

    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder(Stormtrooper.class.getSimpleName());
        sb.append(":\n").append(getCharacteristics()).append("\n");
        return sb.toString();
    }
}
