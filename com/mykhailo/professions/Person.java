package com.mykhailo.professions;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {

    protected String fullName;
    protected String dateOfBirth;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public final void getAge() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int presentYear = Integer.parseInt(formatter.format(date));
        if (dateOfBirth != null && dateOfBirth.length() == 10 && dateOfBirth.substring(6).matches("[0-9]+")
                && dateOfBirth.substring(0, 2).matches("[0-9]+") && dateOfBirth.substring(3, 5).matches("[0-9]+")
                && dateOfBirth.charAt(2) == '.' && dateOfBirth.charAt(5) == '.' && Integer.parseInt(dateOfBirth.substring(0, 2)) > 0
                && Integer.parseInt(dateOfBirth.substring(0, 2)) <= 31 && Integer.parseInt(dateOfBirth.substring(3, 5)) > 0
                && Integer.parseInt(dateOfBirth.substring(3, 5)) <= 12 && Integer.parseInt(dateOfBirth.substring(6)) > 1920
                && Integer.parseInt(dateOfBirth.substring(6)) <= presentYear) {
            int yearOfBirth = Integer.parseInt(dateOfBirth.substring(6));
            System.out.println("Driver is " + (presentYear - yearOfBirth) + " years old.");
        } else {
            System.out.println("Not allowed dateOfBirth format.");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
