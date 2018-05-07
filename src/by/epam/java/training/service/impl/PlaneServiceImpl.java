package by.epam.java.training.service.impl;



import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import by.epam.java.training.service.impl.search.SearchFactory;
import by.epam.java.training.service.impl.sort.SortFactory;
import by.epam.java.training.service.validation.ValidatorFactory;
import org.apache.log4j.Logger;
import by.epam.java.training.entity.Plane;
import by.epam.java.training.entity.Airline;
import by.epam.java.training.entity.CargoPlane;
import by.epam.java.training.printer.PrinterLog;
import by.epam.java.training.service.PlaneService;
import by.epam.java.training.entity.PassengerPlane;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.PlaneCriteria;
import by.epam.java.training.service.impl.search.SearchManager;
import by.epam.java.training.service.impl.sort.SortManager;
import by.epam.java.training.service.validation.CriteriaValidatorManager;


public class PlaneServiceImpl implements PlaneService {

    private static final Logger LOGGER = Logger.getLogger(Plane.class);

    @Override
    public void sort(Airline airline, PlaneCriteria planeCriteria) {

        SortManager sort = SortFactory.getInstance().getSortManager();
        Collections.sort(airline.getPlaneList(), sort.sortByCriteria(planeCriteria));
    }

    @Override
    public List<Plane> find(Airline airline, Criteria criteria) {
        CriteriaValidatorManager validatorManager = ValidatorFactory.getInstance().getValidatorManager();
        if (!validatorManager.isValidCriteria(criteria)){
            PrinterLog.printLogWarn("Not Valid Value", this.LOGGER);
            return  null;
        }

        List<Plane> foundPlanes= new ArrayList<>();
        SearchManager search = SearchFactory.getInstance().getValidatorManager();
        for (Plane plane : airline){
            if (search.IsEqual(plane, criteria)){
                foundPlanes.add(plane);
            }
        }
        return foundPlanes;
    }

    private int getCarringCapacity(Plane plane){
        if (plane instanceof CargoPlane){
            return ((CargoPlane) plane).getCarryingCapacity();
        } else {
            return 0;
        }
    }

    @Override
    public int calcCarringCapacity(Airline airline) {
        int result = 0;
        for (Plane plane : airline){
            result+=getCarringCapacity(plane);
        }
        return result;
    }

    private int getNumberOfSeats(Plane plane){
        if (plane instanceof PassengerPlane){
            return ((PassengerPlane) plane).getNumberOfSeats();
        } else {
            return 0;
        }
    }

    @Override
    public int calcNumberOfSeats(Airline airline) {
        int result = 0;
        for (Plane plane : airline){
            result+=getNumberOfSeats(plane);
        }
        return result;
    }

}
