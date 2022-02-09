package com.mykhailo.vehicles;

public class SportCar extends Car {

    protected int maxSpeed;

    public SportCar(String carBrand, String carClass, double weight, int maxSpeed) {
        super(carBrand, carClass, weight);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }
}
