package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.component.CargoCabin;
import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Wing;

public class An124Builder extends CargoPlaneBuilder {


    @Override
    public void buildName() {
        this.cargoPlane.setName("An-124 'Ruslan'");
    }

    @Override
    public void buildCrewMembers() {
        this.cargoPlane.setCrewMembers(8);
    }

    @Override
    public void buildMaxSpeed() {
        this.cargoPlane.setMaxSpeed(865);
    }

    @Override
    public void buildFuelConsumption() {
        this.cargoPlane.setFuelConsumption(468);
    }

    @Override
    public void buildDistantion() {
        this.cargoPlane.addDistantion(0);
    }

    @Override
    public void buildWing() {
        this.cargoPlane.setWing(new Wing(73.3, 628));
    }

    @Override
    public void buildEngine() {
        this.cargoPlane.setEngine( new Engine("TRDD", "D-18T", 1234, 1433, 4321));
    }

    @Override
    public void buildClassName() {
        this.cargoPlane.setClassName("A Class");
    }

    @Override
    public void buildCarryingCapacity() {
        this.cargoPlane.setCarryingCapacity(120000);
    }

    @Override
    public void buildCargoCabin() {
        this.cargoPlane.setCargoCabin(new CargoCabin(36.5, 6.4, 4.4, 1050));
    }
}

