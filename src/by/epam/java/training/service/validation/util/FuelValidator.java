package by.epam.java.training.service.validation.util;

import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.service.validation.CriteriaValidator;

public class FuelValidator implements CriteriaValidator {

    @Override
    public boolean isValid(Criteria criteria) {
        if (!ValidatorValue.isValidInteger(criteria.getStartValue())){
            return false;
        }
        if (!ValidatorValue.isValidInteger(criteria.getFinishValue())){
            return false;
        }
        return true;
    }
}
