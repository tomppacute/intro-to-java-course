package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private int year;
    private String colour;


    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getMake() {
        return make; // return make
    }

    public String getModel() {
        return model; // return model
    }

    public int getYear(){
        return year; // return year
    }

    public String getColour() {
        return colour; // return colour
    }

    public void setColour(String newColour) {
        this.colour = newColour; // set colour
    }

    public String getDetails() {
        String details = String.format(
            "Make:%s, Model:%s, Year:%s,Colour:%s.",this.make,this.model,this.year,this.colour);
            return details;
    }

}
