package by.epam.java.training.service.impl.search.util;

import by.epam.java.training.entity.Plane;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.service.impl.search.EqualByCriteria;

public class EqualByDistantion implements EqualByCriteria {

    @Override
    public boolean isEqual(Plane plane, Criteria criteria) {
        if (((Double)criteria.getStartValue() <= plane.getDistantion()) &&
                (plane.getDistantion() <= (Double)criteria.getFinishValue())){
            return true;
        } else {
            return false;
        }
    }
}
