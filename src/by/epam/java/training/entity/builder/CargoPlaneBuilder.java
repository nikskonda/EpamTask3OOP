package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.CargoPlane;

public abstract class CargoPlaneBuilder {
    protected CargoPlane cargoPlane;

    public CargoPlane getCargoPlane() {
        return this.cargoPlane;
    }

    public void createNewCargoPlane() {
        this.cargoPlane = new CargoPlane();
    }

    public abstract void buildName();
    public abstract void buildCrewMembers();
    public abstract void buildMaxSpeed();
    public abstract void buildFuelConsumption();
    public abstract void buildDistantion();
    public abstract void buildWing();
    public abstract void buildEngine();
    public abstract void buildClassName();
    public abstract void buildCarryingCapacity();
    public abstract void buildCargoCabin();
}
