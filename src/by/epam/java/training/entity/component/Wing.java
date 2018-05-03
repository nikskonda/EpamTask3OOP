package by.epam.java.training.entity.component;

import java.io.Serializable;
import java.util.Comparator;

public class Wing implements Serializable, Comparator<Wing> {

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
    public int compare(Wing w1, Wing w2) {
        return Double.compare(w1.wingArea, w2.wingArea);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
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
        int hashCode = 0;
        hashCode +=  Double.hashCode(this.wingArea);
        hashCode +=  Double.hashCode(this.wingspan);
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(Wing.class.getSimpleName());
        sb.append(":\n\tWingspan=").append(this.wingspan).append(" Meters\n")
                .append("\tWing Area=").append(this.wingArea).append(" Square Meters\n");
        return sb.toString();
    }
}
