package com.mykhailo.vehicles;

public class CarFactory {

    public static void main(String[] args) {

        SportCar sportCar = new SportCar("Nissan","C",1200, 250);
        sportCar.setDriver("Jack Jackson", 20, "20.03.1980");
        sportCar.setEngine("Renault", 180);
        System.out.println(sportCar);
        Lorry lorry = new Lorry("DAF", "F", 5000, 1500);
        lorry.setDriver("John Johnson", 20, "15.03.1982");
        lorry.setEngine("Renault", 400);
        System.out.println(lorry);
        lorry.driver.getAge();
        sportCar.driver.getAge();

    }
}
