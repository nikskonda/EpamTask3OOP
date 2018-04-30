/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity.component;

import java.util.Objects;

/**
 *
 * @author niksk
 */
public class Engine {

    private static final long serialVersionUID = 1L;

    private String name;
    private String model;
    private double weightInKg;
    private double power;
    private double capacity;

    public Engine() {
    }

    public Engine(String name, String model, double weightInKg, double power, double capacity) {
        this.name = name;
        this.model = model;
        this.weightInKg = weightInKg;
        this.power = power;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.weightInKg, weightInKg) == 0 &&
                Double.compare(engine.power, power) == 0 &&
                Double.compare(engine.capacity, capacity) == 0 &&
                Objects.equals(name, engine.name) &&
                Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, model, weightInKg, power, capacity);
    }
}