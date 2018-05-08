package by.epam.java.training.entity;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Wing;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class PassengerPlane extends CivilPlane implements Serializable {

    private static final long serialVersionUID = 1L;

    private int numberOfSeats;
    private String typeOfSeats;

    public PassengerPlane() {
    }

    public PassengerPlane(String name, int crewMembers, double maxSpeed, int fuelConsumption, double distantion, Wing wing, Engine engine, String className, int numberOfSeats, String typeOfSeats) {
        super(name, crewMembers, maxSpeed, fuelConsumption, distantion, wing, engine, className);
        this.numberOfSeats = numberOfSeats;
        this.typeOfSeats = typeOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeOfSeats() {
        return typeOfSeats;
    }

    public void setTypeOfSeats(String typeOfSeats) {
        this.typeOfSeats = typeOfSeats;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        PassengerPlane passengerPlane = (PassengerPlane) obj;
        if (this.numberOfSeats != passengerPlane.numberOfSeats){
            return false;
        }
        if (this.typeOfSeats != null) {
            if (!this.typeOfSeats.equals(passengerPlane.typeOfSeats)) return false; }
        else if (passengerPlane.typeOfSeats == null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = super.hashCode();
        hashCode = prime * hashCode + (this.typeOfSeats != null ? typeOfSeats.hashCode() : 0);
        hashCode = prime * hashCode + this.numberOfSeats;
        return hashCode;
    }


    public String getCharacteristics(){
        StringBuilder sb = new StringBuilder(super.getCharacteristics());
        sb.append("Seats=").append(this.numberOfSeats).append("\n")
                .append("Type=").append(this.typeOfSeats).append("\n");
        return sb.toString();
    }

    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder(PassengerPlane.class.getSimpleName());
        sb.append(":\n").append(getCharacteristics()).append("\n");

        return sb.toString();
    }
}
