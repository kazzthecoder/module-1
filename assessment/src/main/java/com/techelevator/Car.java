package com.techelevator;

import java.time.Year;

public class Car {
    private int year;
    private String make;
    private boolean isClassicCar;
    private int age;


    public Car(int year, String make, boolean isClassicCar) {
        this.year = year;
        this.make = make;
        this.isClassicCar = isClassicCar;
        this.age = Year.now().getValue() - getYear();
    }


    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public int getAge() {
        return age;
    }

    public boolean receiveECheck(int yearToCheck) {
        boolean getTested = false;
        if (yearToCheck % 2 == getYear() % 2) {
            getTested = true;
        }if (getAge() > 25) {
            getTested = false;
        }
        if (getAge() < 4) {
            getTested = false;
        }
        return getTested;
    }

    @Override
    public String toString() {
        int year = getYear();
       String make = getMake();

       return "CAR - {" + year + "} - {" + make + "}";
    }


    }


