package by.epam.java.training.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Airline implements Serializable, Iterable<Plane> {

    private static final long serialVersionUID = 1L;

    private String name;
    private List<Plane> planeList;

    public Airline() {
    }

    public Airline(String name) {
        this.name = name;
        this.planeList = new ArrayList<>();
    }

    public Airline(String name, List<Plane> planeList) {
        this.name = name;
        this.planeList = planeList;
    }

    public int size(){
        return this.planeList.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Plane> getPlaneList() {
        return planeList;
    }

    public void setPlaneList(List<Plane> planeList) {
        this.planeList = planeList;
    }

    public Plane getPlane(int index){
        return this.planeList.get(index);
    }

    public void setPlane(int index, Plane plane){
        this.planeList.set(index, plane);
    }

    public void addPlane(Plane plane){
        this.planeList.add(plane);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Airline airline = (Airline) obj;
        if (!this.name.equals(airline.name)){
            return false;
        }
        if (!this.planeList.equals(airline.planeList)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        hashCode += this.name.hashCode();
        hashCode += this.planeList.hashCode();
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(Airline.class.getSimpleName());
        sb.append(": ").append(this.name).append("\n");
            for (Plane plane :this.planeList){
                sb.append(plane);
            }
        return sb.toString();
    }

    @Override
    public Iterator<Plane> iterator() {
        return this.planeList.iterator();
    }
}
