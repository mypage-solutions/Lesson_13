package com.mykhailo.vehicles;

public class SportCar extends Car {

    protected final int maxSpeed;

    public SportCar(String carBrand, String carClass, double weight, int maxSpeed) {
        super(carBrand, carClass, weight);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
