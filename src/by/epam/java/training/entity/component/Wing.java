package by.epam.java.training.entity.component;

import java.util.Objects;

public class Wing {

    private static final long serialVersionUID = 1L;

    private double wingspanInMeters;
    private double wingAreaInSquareMeters;

    public Wing() {
    }

    public Wing(double wingspanInMeters, double wingAreaInSquareMeters) {
        this.wingspanInMeters = wingspanInMeters;
        this.wingAreaInSquareMeters = wingAreaInSquareMeters;
    }

    public double getWingspanInMeters() {
        return wingspanInMeters;
    }

    public void setWingspanInMeters(double wingspanInMeters) {
        this.wingspanInMeters = wingspanInMeters;
    }

    public double getWingAreaInSquareMeters() {
        return wingAreaInSquareMeters;
    }

    public void setWingAreaInSquareMeters(double wingAreaInSquareMeters) {
        this.wingAreaInSquareMeters = wingAreaInSquareMeters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wing wing = (Wing) o;
        return Double.compare(wing.wingspanInMeters, wingspanInMeters) == 0 &&
                Double.compare(wing.wingAreaInSquareMeters, wingAreaInSquareMeters) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(wingspanInMeters, wingAreaInSquareMeters);
    }
}
