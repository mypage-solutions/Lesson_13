package com.mykhailo.vehicles;

public class CarFactory {

    public static void main(String[] args) {

        SportCar car = new SportCar("Nissan","C",1200, 250);
        car.setDriver("Jack Jackson", 20, "20.03.1980");
        car.setEngine("Renault", 140);
        System.out.println(car);
        Lorry lorry = new Lorry("DAF", "F", 5000, 1500);
        lorry.setDriver("Jack Jackson", 20, "20.03.1980");
        lorry.setEngine("Renault", 400);
        System.out.println(lorry);
        lorry.getDriver().presentAge();

    }
}
