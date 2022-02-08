package com.mykhailo.vehicles;

import com.mykhailo.details.Engine;
import com.mykhailo.professions.Driver;

public abstract class Car {

    private final String carBrand;
    private final String carClass;
    private final double weight;
    private final Driver driver;
    private final Engine engine;

    public Car(String carBrand, String carClass, double weight) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        driver = new Driver();
        engine = new Engine();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(String name, int experience, String dateOfBirth) {
        driver.setFullName(name);
        driver.setExperience(experience);
        driver.setDateOfBirth(dateOfBirth);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(String company, int power) {
        engine.setCompany(company);
        engine.setPower(power);
    }

    public void start() {
        System.out.println("Let's go.");
    }

    public void stop() {
        System.out.println("Stop.");
    }

    public void turnRight() {
        System.out.println("Turn Right.");
    }

    public void turnLeft() {
        System.out.println("Turn Left.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
