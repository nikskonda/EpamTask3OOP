package by.epam.java.training.service.impl.sort;

import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.PlaneCriteria;
import by.epam.java.training.service.impl.sort.util.SortByDistation;
import by.epam.java.training.service.impl.sort.util.SortByFuelConsumption;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortPlaneManager {

    private Map<PlaneCriteria, Comparator> sorts = new HashMap<>();

    public SortPlaneManager(){
        this.sorts.put(PlaneCriteria.DISTANTION, new SortByDistation());
        this.sorts.put(PlaneCriteria.FUEL_CONSUMPTION, new SortByFuelConsumption());
    }

    public Comparator sortByCriteria(PlaneCriteria planeCriteria) {
        return this.sorts.get(planeCriteria);
    }

}
