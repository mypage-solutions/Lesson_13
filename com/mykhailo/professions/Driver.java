package com.mykhailo.professions;

public class Driver extends Person {

    protected int experience;

    public Driver() {
    }

    public Driver(String fullName, int experience) {
        super(fullName);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}
