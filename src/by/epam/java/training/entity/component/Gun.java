/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity.component;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author niksk
 */
public class Gun implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;
    private double caliber;
    private int numberOfShells;

    public Gun() {
    }

    public Gun(String name, double caliber, int numberOfShells) {
        this.name = name;
        this.caliber = caliber;
        this.numberOfShells = numberOfShells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public int getNumberOfShells() {
        return numberOfShells;
    }

    public void setNumberOfShells(int numberOfShells) {
        this.numberOfShells = numberOfShells;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Gun gun = (Gun) obj;
        if (this.name == null || gun.name == null) return false;
        else if (!this.name.equals(gun.name)) return false;
        if (Double.compare(this.caliber, gun.caliber) != 0) return false;
        if (this.numberOfShells != gun.numberOfShells) return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = hashCode * prime + this.name.hashCode();
        hashCode = hashCode * prime +  Double.hashCode(this.caliber);
        hashCode = hashCode * prime + this.numberOfShells;
        return hashCode;
    }

    public String asString() {
        StringBuilder sb = new StringBuilder(Gun.class.getSimpleName());
        sb.append(":\n\t").append(this.name)
                .append("\n\tCaliber=").append(this.caliber)
                .append("\n\tShells=").append(this.numberOfShells).append(" qnt\n");
        return sb.toString();
    }
}
