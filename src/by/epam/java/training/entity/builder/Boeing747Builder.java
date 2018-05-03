package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Wing;

public class Boeing747Builder extends PassengerPlaneBuilder {

    @Override
    public void buildName() {
        this.passengerPlane.setName("Boeing747-8I");
    }

    @Override
    public void buildCrewMembers() {
        this.passengerPlane.setCrewMembers(2);
    }

    @Override
    public void buildMaxSpeed() {
        this.passengerPlane.setMaxSpeed(988);
    }

    @Override
    public void buildFuelConsumption() {
        this.passengerPlane.setFuelConsumption(242);
    }

    @Override
    public void buildDistantion() {
        this.passengerPlane.addDistantion(0);
    }

    @Override
    public void buildWing() {
        this.passengerPlane.setWing(new Wing(68.45, 245.54));
    }

    @Override
    public void buildEngine() {
        this.passengerPlane.setEngine( new Engine("GEnx-2B67", "2B67", 1234, 567, 4321));
    }

    @Override
    public void buildClassName() {
        this.passengerPlane.setClassName("A Class");
    }

    @Override
    public void buildNumberOfSeats() {
        this.passengerPlane.setNumberOfSeats(1048);
    }

    @Override
    public void buildTypeOfSeats() {
        this.passengerPlane.setTypeOfSeats("3 Class");
    }
}
