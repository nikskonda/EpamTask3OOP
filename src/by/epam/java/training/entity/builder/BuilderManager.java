package by.epam.java.training.entity.builder;

import by.epam.java.training.entity.CargoPlane;
import by.epam.java.training.entity.Fighter;
import by.epam.java.training.entity.PassengerPlane;
import by.epam.java.training.entity.Stormtrooper;

public class BuilderManager {

    private PassengerPlaneBuilder passengerPlaneBuild;
    private CargoPlaneBuilder cargoPlaneBuilder;
    private FighterBuilder fighterBuilder;
    private StormtrooperBuilder stormtrooperBuilder;

    public void setPassengerPlaneBuilder(PassengerPlaneBuilder planeBuilder){
        this.passengerPlaneBuild = planeBuilder;
    }

    public PassengerPlane getPassengerPlane(){
        return this.passengerPlaneBuild.getPassengerPlane();
    }

    public void constructPassengerPlane(){
        this.passengerPlaneBuild.createNewPassengerPlane();
        this.passengerPlaneBuild.buildClassName();
        this.passengerPlaneBuild.buildCrewMembers();
        this.passengerPlaneBuild.buildDistantion();
        this.passengerPlaneBuild.buildEngine();
        this.passengerPlaneBuild.buildFuelConsumption();
        this.passengerPlaneBuild.buildMaxSpeed();
        this.passengerPlaneBuild.buildName();
        this.passengerPlaneBuild.buildNumberOfSeats();
        this.passengerPlaneBuild.buildTypeOfSeats();
        this.passengerPlaneBuild.buildWing();
    }

    public void setCargoPlaneBuilder(CargoPlaneBuilder planeBuilder){
        this.cargoPlaneBuilder = planeBuilder;
    }

    public CargoPlane getCargoPlane(){
        return this.cargoPlaneBuilder.getCargoPlane();
    }

    public void constructCargoPlane(){
        this.cargoPlaneBuilder.createNewCargoPlane();
        this.cargoPlaneBuilder.buildClassName();
        this.cargoPlaneBuilder.buildCrewMembers();
        this.cargoPlaneBuilder.buildDistantion();
        this.cargoPlaneBuilder.buildEngine();
        this.cargoPlaneBuilder.buildFuelConsumption();
        this.cargoPlaneBuilder.buildMaxSpeed();
        this.cargoPlaneBuilder.buildName();
        this.cargoPlaneBuilder.buildWing();
        this.cargoPlaneBuilder.buildCargoCabin();
        this.cargoPlaneBuilder.buildCarryingCapacity();
    }

    public void setFighterBuilder(FighterBuilder planeBuilder){
        this.fighterBuilder = planeBuilder;
    }

    public Fighter getFighter(){
        return this.fighterBuilder.getFighter();
    }

    public void constructFighter(){
        this.fighterBuilder.createNewFighter();
        this.fighterBuilder.buildCrewMembers();
        this.fighterBuilder.buildDistantion();
        this.fighterBuilder.buildEngine();
        this.fighterBuilder.buildFuelConsumption();
        this.fighterBuilder.buildMaxSpeed();
        this.fighterBuilder.buildName();
        this.fighterBuilder.buildWing();
        this.fighterBuilder.buildNumberOfMachineGuns();
        this.fighterBuilder.buildNumberOfMissiles();
        this.fighterBuilder.buildGun();
    }

    public void setStormtrooperBuilder(StormtrooperBuilder planeBuilder){
        this.stormtrooperBuilder = planeBuilder;
    }

    public Stormtrooper getStormtrooper(){
        return this.stormtrooperBuilder.getStormtrooper();
    }

    public void constructStormtrooper(){
        this.stormtrooperBuilder.createNewStormtrooper();
        this.stormtrooperBuilder.buildCrewMembers();
        this.stormtrooperBuilder.buildDistantion();
        this.stormtrooperBuilder.buildEngine();
        this.stormtrooperBuilder.buildFuelConsumption();
        this.stormtrooperBuilder.buildMaxSpeed();
        this.stormtrooperBuilder.buildName();
        this.stormtrooperBuilder.buildWing();
        this.stormtrooperBuilder.buildNumberOfBombs();
        this.stormtrooperBuilder.buildGun();
    }


}
