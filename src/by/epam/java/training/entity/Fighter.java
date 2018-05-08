/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity;

import java.io.Serializable;

/**
 *
 * @author niksk
 */
public class Fighter extends MilitaryPlane implements Serializable {

    private static final long serialVersionUID = 1L;

    private int numberOfMachineGuns;
    private int numberOfMissiles;

    public Fighter() {
    }

    public Fighter(int numberOfMachineGuns, int numberOfMissiles) {
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Fighter stormtrooper = (Fighter) obj;

        if (this.numberOfMachineGuns != stormtrooper.numberOfMachineGuns){
            return false;
        }
        if (this.numberOfMissiles != stormtrooper.numberOfMissiles){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = super.hashCode();
        hashCode = prime * hashCode + this.numberOfMachineGuns;
        hashCode = prime * hashCode + this.numberOfMissiles;
        return hashCode;
    }

    public String getCharacteristics(){
        StringBuilder sb = new StringBuilder(super.getCharacteristics());
        sb.append("Missiles=").append(this.numberOfMissiles).append("\n")
                .append("Machine Guns=").append(this.numberOfMachineGuns).append("\n");
        return sb.toString();
    }

    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder(Fighter.class.getSimpleName());
        sb.append(":\n").append(getCharacteristics()).append("\n");
        return sb.toString();
    }

}
