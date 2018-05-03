package by.epam.java.training.service;

import by.epam.java.training.entity.Airline;
import by.epam.java.training.entity.Plane;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.PlaneCriteria;

import java.util.List;

public interface PlaneService {

    void sort(Airline airline, PlaneCriteria planeCriteria);

    List<Plane> find(Airline airline, Criteria criteria);

    int calcCarringCapacity(Airline airline);

    int calcNumberOfSeats(Airline airline);
}
