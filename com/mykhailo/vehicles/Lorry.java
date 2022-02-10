package com.mykhailo.vehicles;

public class Lorry extends Car{

    protected final int carrying;

    public Lorry(String carBrand, String carClass, double weight, int carrying) {
        super(carBrand, carClass, weight);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", carrying=" + carrying +
                '}';
    }
}
