package com.mykhailo.professions;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {

    private String dateOfBirth;
    private String fullName;

    public Person() {
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public Person(String dayOfBirth, String fullName) {
        this.dateOfBirth = dayOfBirth;
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public final void presentAge() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int presentYear = Integer.parseInt(formatter.format(date));
        int yearOfBirth = Integer.parseInt(dateOfBirth.substring(6));
        System.out.println(presentYear - yearOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
