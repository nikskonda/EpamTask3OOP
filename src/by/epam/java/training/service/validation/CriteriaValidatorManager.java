package by.epam.java.training.service.validation;

import by.epam.java.training.entity.Plane;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.PlaneCriteria;
import by.epam.java.training.service.validation.util.DistantionValidator;
import by.epam.java.training.service.validation.util.FuelValidator;

import java.util.HashMap;
import java.util.Map;

public class CriteriaValidatorManager {

    private Map<PlaneCriteria, CriteriaValidator > validators = new HashMap<>();

    public CriteriaValidatorManager(){
        this.validators.put(PlaneCriteria.DISTANTION, new DistantionValidator());
        this.validators.put(PlaneCriteria.FUEL_CONSUMPTION, new FuelValidator());
    }


    public boolean isValidCriteria(Criteria criteria) {
        return validators.get(criteria.getPlaneCriteria()).isValid(criteria);
    }

}
