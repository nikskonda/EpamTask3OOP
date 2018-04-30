package by.epam.java.training.entity;

import by.epam.java.training.entity.component.CargoCabin;
import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Wing;

import java.util.List;
import java.util.Objects;

public class CargoPlane extends Plane{

    private static final long serialVersionUID = 1L;

    private int carryingCapacityInKG;
    private CargoCabin cargoCabin;

    public CargoPlane() {
    }

    public CargoPlane(String name, int crewMembers, double maxSpeedInKPH, double weightInKG, double massOfFuelInKG, Wing wing, List<Engine> engines, int carryingCapacityInKG, CargoCabin cargoCabin) {
        super(name, crewMembers, maxSpeedInKPH, weightInKG, massOfFuelInKG, wing, engines);
        this.carryingCapacityInKG = carryingCapacityInKG;
        this.cargoCabin = cargoCabin;
    }

    public int getCarryingCapacityInKG() {
        return carryingCapacityInKG;
    }

    public void setCarryingCapacityInKG(int carryingCapacityInKG) {
        this.carryingCapacityInKG = carryingCapacityInKG;
    }

    public CargoCabin getCargoCabin() {
        return cargoCabin;
    }

    public void setCargoCabin(CargoCabin cargoCabin) {
        this.cargoCabin = cargoCabin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoPlane that = (CargoPlane) o;
        return carryingCapacityInKG == that.carryingCapacityInKG &&
                Objects.equals(cargoCabin, that.cargoCabin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), carryingCapacityInKG, cargoCabin);
    }
}