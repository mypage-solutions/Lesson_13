package com.mykhailo.vehicles;

public class Lorry extends Car{

    private int carrying;

    public Lorry(String carBrand, String carClass, double weight, int carrying) {
        super(carBrand, carClass, weight);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "} " + super.toString();
    }
}
