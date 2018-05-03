package by.epam.java.training.entity.component;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class CargoCabin implements Serializable, Comparator<CargoCabin> {

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
    public int compare(CargoCabin cargoCabin1, CargoCabin cargoCabin2) {
        return Double.compare(cargoCabin1.capacity, cargoCabin2.capacity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CargoCabin cargoCabin = (CargoCabin) obj;

        if (Double.compare(cargoCabin.lenght, lenght) != 0){
            return false;
        }
        if (Double.compare(cargoCabin.width, width) != 0){
            return false;
        }
        if (Double.compare(cargoCabin.height, height) != 0){
            return false;
        }
        if (Double.compare(cargoCabin.capacity, capacity) != 0){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        hashCode += Double.hashCode(this.capacity);
        hashCode += Double.hashCode(this.height);
        hashCode += Double.hashCode(this.lenght);
        hashCode += Double.hashCode(this.width);
        return  hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(CargoCabin.class.getSimpleName());
        sb.append(":\n\tLenght").append(this.lenght)
                .append("\n\tWidth=").append(this.width)
                .append("\n\tHeight=").append(this.height)
                .append("\n\tCapacity=").append(this.capacity).append("\n");
        return sb.toString();
    }
}
