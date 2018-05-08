package by.epam.java.training.entity.component;

import java.io.Serializable;
import java.util.Comparator;

public class Wing implements Serializable {

    private static final long serialVersionUID = 1L;

    private double wingspan;
    private double wingArea;

    public Wing() {
    }

    public Wing(double wingspan, double wingArea) {
        this.wingspan = wingspan;
        this.wingArea = wingArea;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getWingArea() {
        return wingArea;
    }

    public void setWingArea(double wingArea) {
        this.wingArea = wingArea;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Wing wing = (Wing) obj;
        if (this.wingArea != wing.wingArea){
            return false;
        }
        if (this.wingspan != wing.wingspan){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = hashCode * prime + Double.hashCode(this.wingArea);
        hashCode = hashCode * prime + Double.hashCode(this.wingspan);
        return hashCode;
    }

    public String asString() {
        StringBuilder sb = new StringBuilder(Wing.class.getSimpleName());
        sb.append(":\n\tWingspan=").append(this.wingspan).append(" Meters\n")
                .append("\tWing Area=").append(this.wingArea).append(" Square Meters\n");
        return sb.toString();
    }
}
