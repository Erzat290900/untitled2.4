package com.company;

public class Garage<J extends Car> implements Movable {
    private J inhabitant;


    public Garage(J inhabitant) {
        this.inhabitant = inhabitant;
    }

    public Garage() {
    }

    public J getInhabitant() {
        return inhabitant;
    }

    public void setInhabitant(J inhabitant) {
        this.inhabitant = inhabitant;
    }


    @Override
    public Object start() {
        return null;
    }
}
