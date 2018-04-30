/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity.component;

import java.util.Objects;

/**
 *
 * @author niksk
 */
public class Gun {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gun gun = (Gun) o;
        return Double.compare(gun.caliber, caliber) == 0 &&
                numberOfShells == gun.numberOfShells &&
                Objects.equals(name, gun.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, caliber, numberOfShells);
    }
}
