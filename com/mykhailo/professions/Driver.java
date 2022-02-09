package com.mykhailo.professions;

public class Driver extends Person {

    protected String fullName;
    protected int experience;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
                "fullName='" + fullName + '\'' +
                ", experience=" + experience +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                "} ";
    }
}
