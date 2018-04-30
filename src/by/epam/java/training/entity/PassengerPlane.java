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

    public PassengerPlane(String name, int crewMembers, double maxSpeedInKPH, double weightInKG, double massOfFuelInKG, Wing wing, List<Engine> engines, int numberOfSeats, String typeOfSeats) {
        super(name, crewMembers, maxSpeedInKPH, weightInKG, massOfFuelInKG, wing, engines);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return numberOfSeats == that.numberOfSeats &&
                Objects.equals(typeOfSeats, that.typeOfSeats);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), numberOfSeats, typeOfSeats);
    }
}
