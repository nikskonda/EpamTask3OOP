/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.java.training.entity;

import by.epam.java.training.entity.component.Engine;
import by.epam.java.training.entity.component.Wing;

import java.util.List;

/**
 *
 * @author niksk
 */
public class CivilPlane extends Plane{
    private static final long serialVersionUID = 1L;

    public CivilPlane() {
    }

    public CivilPlane(String name, int crewMembers, double maxSpeedInKPH, double weightInKG, double massOfFuelInKG, Wing wing, List<Engine> engines) {
        super(name, crewMembers, maxSpeedInKPH, weightInKG, massOfFuelInKG, wing, engines);
    }

}
