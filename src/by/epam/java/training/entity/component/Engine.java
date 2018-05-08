/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity.component;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author niksk
 */
public class Engine implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String model;
    private double weight;
    private int power;
    private double capacity;

    public Engine() {
    }

    public Engine(String name, String model, double weight, int power, double capacity) {
        this.name = name;
        this.model = model;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Engine engine = (Engine) obj;

        if (this.name == null || engine.name == null) return false;
        else if (!this.name.equals(engine.name)) return false;

        if (this.model.equals(engine.model)) return false;
        if (Double.compare(engine.weight, weight) != 0) return false;
        if (Double.compare(engine.power, power) != 0) return false;
        if (Double.compare(engine.capacity, capacity) != 0) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = hashCode * prime + this.name.hashCode();
        hashCode = hashCode * prime + Double.hashCode(this.capacity);
        hashCode = hashCode * prime + Double.hashCode(this.weight);
        hashCode = hashCode * prime + Double.hashCode(this.power);
        hashCode = hashCode * prime + Double.hashCode(this.power);
        return hashCode;
    }


    public String asString() {
        StringBuilder sb = new StringBuilder(Engine.class.getSimpleName());
        sb.append(":\n\t").append(this.name)
                .append("\n\tModel=").append(this.model)
                .append("\n\tPower=").append(this.power)
                .append("\n\tCapacity=").append(this.capacity)
                .append("\n\tWeight=").append(this.weight).append(" KG\n");
        return sb.toString();
    }
}