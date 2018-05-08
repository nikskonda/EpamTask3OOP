/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Wing;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author niksk
 */
public class CivilPlane extends Plane implements Serializable {

    private static final long serialVersionUID = 1L;

    private String className;

    public CivilPlane() {
    }

    public CivilPlane(String name, int crewMembers, double maxSpeed, int fuelConsumption, double distantion, Wing wing, Engine engine, String className) {
        super(name, crewMembers, maxSpeed, fuelConsumption, distantion, wing, engine);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        CivilPlane civilPlane = (CivilPlane) obj;

        if (this.className != null) {
            if (!this.className.equals(civilPlane.className)) return false; }
        else if (civilPlane.className == null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = super.hashCode();;
        hashCode = prime * hashCode + (className != null ? className.hashCode() : 0);
        return hashCode;
    }

    public String getCharacteristics(){
        StringBuilder sb = new StringBuilder(super.getCharacteristics());
        sb.append("Class=").append(this.className).append("\n");
        return sb.toString();
    }

    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder(CivilPlane.class.getSimpleName());
        sb.append(":\n").append(getCharacteristics());
        return sb.toString();
    }
}
