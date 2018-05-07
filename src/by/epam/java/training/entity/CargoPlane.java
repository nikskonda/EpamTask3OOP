package by.epam.java.training.entity;

import by.epam.java.training.entity.component.CargoCabin;
import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Wing;

import java.io.Serializable;

public class CargoPlane extends CivilPlane implements Serializable {

    private static final long serialVersionUID = 1L;

    private int carryingCapacity;
    private CargoCabin cargoCabin;

    public CargoPlane() {
    }

    public CargoPlane(String name, int crewMembers, double maxSpeed, int fuelConsumption, double distantion, Wing wing, Engine engine, String className, int carryingCapacity, CargoCabin cargoCabin) {
        super(name, crewMembers, maxSpeed, fuelConsumption, distantion, wing, engine, className);
        this.carryingCapacity = carryingCapacity;
        this.cargoCabin = cargoCabin;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public CargoCabin getCargoCabin() {
        return cargoCabin;
    }

    public void setCargoCabin(CargoCabin cargoCabin) {
        this.cargoCabin = cargoCabin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        CargoPlane cargoPlane = (CargoPlane) obj;
        if (this.carryingCapacity != cargoPlane.carryingCapacity){
            return false;
        }
        if (!this.cargoCabin.equals(cargoPlane.cargoCabin)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 0;
        hashCode += super.hashCode();
        hashCode += this.carryingCapacity * prime;
        hashCode += this.cargoCabin.hashCode();
        return hashCode;
    }

    public String getCharacteristics(){
        StringBuilder sb = new StringBuilder(super.getCharacteristics());
        sb.append("Carrying capacity=").append(this.carryingCapacity).append("\n")
                .append(this.cargoCabin).append("\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(CargoPlane.class.getSimpleName());
        sb.append(":\n").append(getCharacteristics()).append("\n");
        return sb.toString();
    }

}