package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.Stormtrooper;

public abstract class StormtrooperBuilder {

    protected Stormtrooper stormtrooper;

    public Stormtrooper getStormtrooper() {
        return this.stormtrooper;
    }

    public void createNewStormtrooper() {
        this.stormtrooper = new Stormtrooper();
    }

    public abstract void buildName();
    public abstract void buildCrewMembers();
    public abstract void buildMaxSpeed();
    public abstract void buildFuelConsumption();
    public abstract void buildDistantion();
    public abstract void buildWing();
    public abstract void buildEngine();
    public abstract void buildGun();
    public abstract void buildNumberOfBombs();

}
