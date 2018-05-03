package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.Fighter;
import by.epam.java.training.entity.Stormtrooper;

public abstract class FighterBuilder {

    protected Fighter fighter;

    public Fighter getFighter() {
        return this.fighter;
    }

    public void createNewFighter() {
        this.fighter = new Fighter();
    }

    public abstract void buildName();
    public abstract void buildCrewMembers();
    public abstract void buildMaxSpeed();
    public abstract void buildFuelConsumption();
    public abstract void buildDistantion();
    public abstract void buildWing();
    public abstract void buildEngine();
    public abstract void buildGun();
    public abstract void buildNumberOfMachineGuns();
    public abstract void buildNumberOfMissiles();

}
