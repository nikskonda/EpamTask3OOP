package by.epam.java.training.entity;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Wing;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.Comparator;

public class Plane implements Serializable{

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(Plane.class);
    
    private String name;
    private int crewMembers;
    private double maxSpeed;
    private int fuelConsumption;
    private double distantion;
    private Wing wing;
    private Engine engine;

    public Plane() {
        this.wing = new Wing();
        this.engine = new Engine();
    }

    public Plane(String name, int crewMembers, double maxSpeed, int fuelConsumption, double distantion, Wing wing, Engine engine) {
        this.name = name;
        this.crewMembers = crewMembers;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.distantion = distantion;
        this.wing = wing;
        this.engine = engine;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(int crewMembers) {
        this.crewMembers = crewMembers;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getDistantion() {
        return distantion;
    }

    public void addDistantion(double distantion) {
        this.distantion += distantion;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Plane plane = (Plane) obj;

        if (!this.name.equals(plane.name)) {
            return false;
        }
        if (this.crewMembers != plane.crewMembers){
            return false;
        }
        if (Double.compare(this.maxSpeed, plane.maxSpeed) != 0){
            return false;
        }
        if (this.fuelConsumption != plane.fuelConsumption){
            return false;
        }
        if (Double.compare(plane.distantion, this.distantion) != 0){
            return false;
        }
        if (this.wing != null) {
            if (!this.wing.equals(plane.wing)) return false; }
        else if (plane.wing == null) return false;

        if (this.engine != null) {
            if (!this.engine.equals(plane.engine)) return false; }
        else if (plane.engine == null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + (name != null ? name.hashCode() : 0);
        hashCode = prime * hashCode +  this.crewMembers;
        hashCode = prime * hashCode +  Double.hashCode(this.maxSpeed);
        hashCode = prime * hashCode +  this.fuelConsumption;
        hashCode = prime * hashCode +  Double.hashCode(this.distantion);
        hashCode = prime * hashCode + this.wing.hashCode();
        hashCode = prime * hashCode + this.engine.hashCode();
        return hashCode;
    }

    public String getCharacteristics(){
        StringBuilder sb = new StringBuilder(this.name);
        sb.append("\nCrew Members=").append(this.crewMembers)
                .append("\nMax Speed=").append(this.maxSpeed)
                .append("\nFuel Consumption=").append(this.fuelConsumption)
                .append("\nDistantion=").append(this.distantion).append("\n")
                .append(this.wing.asString()).append(this.engine.asString());
        return sb.toString();
    }


    public String asString() {
        StringBuilder sb = new StringBuilder(Plane.class.getSimpleName());
        sb.append(":\n").append(this.getCharacteristics());
        return sb.toString();
    }

}
