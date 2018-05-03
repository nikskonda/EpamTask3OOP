package by.epam.java.training.printer;

import by.epam.java.training.entity.Airline;
import by.epam.java.training.entity.Plane;

import java.util.List;

public class Printer {

    private Printer(){}

    public static void printAirline(Airline airline){
        System.out.println(airline);
    }

    public static void printPlane(Plane plane){
        System.out.println(plane);
    }
    public static void printPlaneList(List<Plane> planeList){
        if (planeList == null || planeList.size()==0){
            printMessage("Empty list");
        } else {
            for (Plane plane : planeList){
                printPlane(plane);
            }
        }
    }

    public static void printMessage(String message){
        System.out.println(message);
    }

}
