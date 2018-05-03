package by.epam.java.training.service.impl.search;


import by.epam.java.training.entity.Plane;
import by.epam.java.training.entity.criteria.Criteria;

public interface EqualByCriteria {
    boolean isEqual(Plane plane, Criteria criteria);
}
