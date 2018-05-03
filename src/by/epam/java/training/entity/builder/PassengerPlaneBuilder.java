package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.PassengerPlane;

public abstract class PassengerPlaneBuilder{

    protected PassengerPlane passengerPlane;

    public PassengerPlane getPassengerPlane() {
        return this.passengerPlane;
    }

    public void createNewPassengerPlane() {
        this.passengerPlane = new PassengerPlane();
    }

    public abstract void buildName();
    public abstract void buildCrewMembers();
    public abstract void buildMaxSpeed();
    public abstract void buildFuelConsumption();
    public abstract void buildDistantion();
    public abstract void buildWing();
    public abstract void buildEngine();
    public abstract void buildClassName();
    public abstract void buildNumberOfSeats();
    public abstract void buildTypeOfSeats();


}
