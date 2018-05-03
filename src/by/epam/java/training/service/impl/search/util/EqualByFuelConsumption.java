package by.epam.java.training.service.impl.search.util;

import by.epam.java.training.entity.Plane;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.service.impl.search.EqualByCriteria;

public class EqualByFuelConsumption implements EqualByCriteria {

    @Override
    public boolean isEqual(Plane plane, Criteria criteria) {
        if (((Integer)criteria.getStartValue() <= plane.getFuelConsumption()) &&
                (plane.getFuelConsumption() <= (Integer)criteria.getFinishValue())){
            return true;
        } else {
            return false;
        }
    }
}
