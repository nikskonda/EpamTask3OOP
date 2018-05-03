package by.epam.java.training.service.impl.search;

import by.epam.java.training.entity.Plane;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.PlaneCriteria;
import by.epam.java.training.service.impl.search.util.EqualByDistantion;
import by.epam.java.training.service.impl.search.util.EqualByFuelConsumption;
import by.epam.java.training.service.impl.sort.util.SortByDistation;
import by.epam.java.training.service.impl.sort.util.SortByFuelConsumption;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SearchManager {

    private Map<PlaneCriteria, EqualByCriteria> sorts = new HashMap<>();

    public SearchManager(){
        this.sorts.put(PlaneCriteria.DISTANTION, new EqualByDistantion());
        this.sorts.put(PlaneCriteria.FUEL_CONSUMPTION, new EqualByFuelConsumption());
    }

    public boolean IsEqual(Plane plane, Criteria criteria) {
        return this.sorts.get(criteria.getPlaneCriteria()).isEqual(plane, criteria);
    }

}
