package by.epam.java.training.service.validation.util;

import by.epam.java.training.entity.Plane;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.service.validation.CriteriaValidator;

public class DistantionValidator implements CriteriaValidator {
    @Override
    public boolean isValid(Criteria criteria) {
        if (!ValidatorValue.isValidDouble(criteria.getStartValue())){
            return false;
        }
        if (!ValidatorValue.isValidDouble(criteria.getFinishValue())){
            return false;
        }
        return true;
    }
}
