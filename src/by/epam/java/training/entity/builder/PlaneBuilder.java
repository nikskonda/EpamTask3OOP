package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.Plane;

public abstract class PlaneBuilder {

    protected Plane plane;

    public Plane getPlane() {
        return this.plane;
    }

    public void createNewPlane() {
        this.plane = new Plane();
    }

    public abstract void buildName();
    public abstract void buildCrewMembers();
    public abstract void buildMaxSpeed();
    public abstract void buildFuelConsumption();
    public abstract void buildDistantion();
    public abstract void buildWing();
    public abstract void buildEngine();
}
