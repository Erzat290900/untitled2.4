package com.company;

public class Main {

    public static void main(String[] args) {
        Garage<Car> garage = new Garage<>();
        Garage<Car> garage1 = new Garage<>();
        Garage<Car> garage2 = new Garage<>();

        garage.setInhabitant(new Mers(2000));
        garage1.setInhabitant(new Bmw(3));
        garage2.setInhabitant(new Passat(50));
        System.out.println(Color.BLUE + " " + garage.getInhabitant().getYear() + "\n" +
                (Color.BLACK + " " + garage1.getInhabitant().getYear()) + "\n" +
                (Color.SILVER + " " + garage2.getInhabitant().getYear()));
    }

}

