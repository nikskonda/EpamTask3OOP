/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.controller;

import by.epam.java.training.entity.Airline;
import by.epam.java.training.entity.builder.*;
import by.epam.java.training.entity.criteria.Criteria;
import by.epam.java.training.entity.criteria.PlaneCriteria;
import by.epam.java.training.printer.Printer;
import by.epam.java.training.service.ServiceFactory;


public class Controller {

    public static void main(String[] args) {
        BuilderManager builderManager = new BuilderManager();

        builderManager.setCargoPlaneBuilder(new An124Builder());
        builderManager.setPassengerPlaneBuilder(new Boeing747Builder());
        builderManager.setStormtrooperBuilder(new CY25Builder());
        builderManager.setFighterBuilder(new CY35Builder());

        builderManager.constructCargoPlane();
        builderManager.constructPassengerPlane();
        builderManager.constructFighter();
        builderManager.constructStormtrooper();

        Airline airline = new Airline("MyAirLine");

        builderManager.getCargoPlane().addDistantion(123);
        builderManager.getPassengerPlane().addDistantion(1);
        builderManager.getFighter().addDistantion(2432);

        airline.addPlane(builderManager.getCargoPlane());
        airline.addPlane(builderManager.getPassengerPlane());
        airline.addPlane(builderManager.getFighter());
        airline.addPlane(builderManager.getStormtrooper());

        Printer.printAirline(airline);

        int capacity = ServiceFactory.getInstance().getProductService().calcCarringCapacity(airline);
        Printer.printMessage("***\nCarringCapacity = " + capacity);

        int seats = ServiceFactory.getInstance().getProductService().calcNumberOfSeats(airline);
        Printer.printMessage("***\nSeats = " + seats);

        Printer.printMessage("***\nSort by fuel ...");
        ServiceFactory.getInstance().getProductService().sort(airline, PlaneCriteria.FUEL_CONSUMPTION);
        Printer.printAirline(airline);

        Printer.printMessage("***\nEmply List + log");
        Printer.printPlaneList(ServiceFactory.getInstance().getProductService().find(airline, new Criteria(PlaneCriteria.FUEL_CONSUMPTION, 200.0, 400)));


        Printer.printMessage("***\nSearch");
        Printer.printPlaneList(ServiceFactory.getInstance().getProductService().find(airline, new Criteria(PlaneCriteria.FUEL_CONSUMPTION, 200, 400)));


    }
    
}
