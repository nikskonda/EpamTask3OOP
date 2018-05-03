package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Gun;
import by.epam.java.training.entity.component.Wing;

public class CY35Builder extends FighterBuilder {
    @Override
    public void buildName() {
        this.fighter.setName("CY-35");
    }

    @Override
    public void buildCrewMembers() {
        this.fighter.setCrewMembers(1);
    }

    @Override
    public void buildMaxSpeed() {
        this.fighter.setMaxSpeed(2500);
    }

    @Override
    public void buildFuelConsumption() {
        this.fighter.setFuelConsumption(143);
    }

    @Override
    public void buildDistantion() {
        this.fighter.addDistantion(0);
    }

    @Override
    public void buildWing() {
        this.fighter.setWing(new Wing(14.75, 62.04));
    }

    @Override
    public void buildEngine() {
        this.fighter.setEngine( new Engine("TRDDF", "AL-41F1C", 1520, 14500, 4321));
    }

    @Override
    public void buildGun() {
        this.fighter.setGun( new Gun("GSH-30-1", 30,150));
    }

    @Override
    public void buildNumberOfMachineGuns() {
        this.fighter.setNumberOfMachineGuns(12);
    }

    @Override
    public void buildNumberOfMissiles() {
        this.fighter.setNumberOfMissiles(6);
    }

}
