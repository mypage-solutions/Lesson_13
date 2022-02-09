package com.mykhailo.vehicles;

public class Lorry extends Car{

    private final int carrying;

    public Lorry(String carBrand, String carClass, double weight, int carrying) {
        super(carBrand, carClass, weight);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "} " + super.toString();
    }
}
