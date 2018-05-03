package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Gun;
import by.epam.java.training.entity.component.Wing;

public class CY25Builder extends StormtrooperBuilder {

    @Override
    public void buildName() {
        this.stormtrooper.setName("CY-25");
    }

    @Override
    public void buildCrewMembers() {
        this.stormtrooper.setCrewMembers(1);
    }

    @Override
    public void buildMaxSpeed() {
        this.stormtrooper.setMaxSpeed(950);
    }

    @Override
    public void buildFuelConsumption() {
        this.stormtrooper.setFuelConsumption(321);
    }

    @Override
    public void buildDistantion() {
        this.stormtrooper.addDistantion(0);
    }

    @Override
    public void buildWing() {
        this.stormtrooper.setWing(new Wing(14.36, 30.1));
    }

    @Override
    public void buildEngine() {
        this.stormtrooper.setEngine( new Engine("P", "195", 1332, 4300, 4321));
    }

    @Override
    public void buildGun() {
        this.stormtrooper.setGun( new Gun("GSH-30-2", 30,250));
    }

    @Override
    public void buildNumberOfBombs() {
        this.stormtrooper.setNumberOfBombs(32);
    }

}
