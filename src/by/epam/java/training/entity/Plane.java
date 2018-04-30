package by.epam.java.training.entity;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Wing;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author niksk
 */
public class Plane implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String name;
    private int crewMembers;
    private double maxSpeedInKPH;
    private double weightInKG;
    private double massOfFuelInKG;
    private Wing wing;
    private List<Engine> engines;

    public Plane() {
    }

    public Plane(String name, int crewMembers, double maxSpeedInKPH, double weightInKG, double massOfFuelInKG, Wing wing, List<Engine> engines) {
        this.name = name;
        this.crewMembers = crewMembers;
        this.maxSpeedInKPH = maxSpeedInKPH;
        this.weightInKG = weightInKG;
        this.massOfFuelInKG = massOfFuelInKG;
        this.wing = wing;
        this.engines = engines;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(int crewMembers) {
        this.crewMembers = crewMembers;
    }

    public double getMaxSpeedInKPH() {
        return maxSpeedInKPH;
    }

    public void setMaxSpeedInKPH(double maxSpeedInKPH) {
        this.maxSpeedInKPH = maxSpeedInKPH;
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(double weightInKG) {
        this.weightInKG = weightInKG;
    }

    public double getMassOfFuelInKG() {
        return massOfFuelInKG;
    }

    public void setMassOfFuelInKG(double massOfFuelInKG) {
        this.massOfFuelInKG = massOfFuelInKG;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public List<Engine> getEngines() {
        return engines;
    }

    public void setEngines(List<Engine> engines) {
        this.engines = engines;
    }

    public void addEngine(Engine engine){
        this.engines.add(engine);
    }

    public Engine getEngine(int index){
        return this.engines.get(index);
    }

    public void setEngine(int index, Engine engine){
        this.engines.set(index, engine);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return crewMembers == plane.crewMembers &&
                Double.compare(plane.maxSpeedInKPH, maxSpeedInKPH) == 0 &&
                Double.compare(plane.weightInKG, weightInKG) == 0 &&
                Double.compare(plane.massOfFuelInKG, massOfFuelInKG) == 0 &&
                Objects.equals(name, plane.name) &&
                Objects.equals(wing, plane.wing) &&
                Objects.equals(engines, plane.engines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, crewMembers, maxSpeedInKPH, weightInKG, massOfFuelInKG, wing, engines);
    }
}
