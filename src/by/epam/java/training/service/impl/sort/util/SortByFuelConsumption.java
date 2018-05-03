package by.epam.java.training.service.impl.sort.util;

import by.epam.java.training.entity.Plane;

import java.util.Comparator;

public class SortByFuelConsumption implements Comparator<Plane> {

    @Override
    public int compare(Plane p1, Plane p2) {
        return Double.compare(p1.getFuelConsumption(), p2.getFuelConsumption());
    }
}
