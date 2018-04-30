package by.epam.java.training.entity.component;

import java.util.Objects;

public class CargoCabin {

    private static final long serialVersionUID = 1L;

    private double lenght;
    private double width;
    private double height;
    private double capacity;

    public CargoCabin() {
    }

    public CargoCabin(double size, double capacity) {
        this.lenght = size;
        this.width = size;
        this.height = size;
        this.capacity = capacity;
    }

    public CargoCabin(double lenght, double width, double height, double capacity) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.capacity = capacity;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
        CargoCabin that = (CargoCabin) o;
        return Double.compare(that.lenght, lenght) == 0 &&
                Double.compare(that.width, width) == 0 &&
                Double.compare(that.height, height) == 0 &&
                Double.compare(that.capacity, capacity) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(lenght, width, height, capacity);
    }
}
