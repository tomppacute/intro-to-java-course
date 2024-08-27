package com.cbfacademy.shapes;

public class Paint {
    double coverage;
    public Paint(double coverage) {
        this.coverage = coverage;
    }
    //- constructor that accepts a parameter representing the number of square feet per gallon this paint can cover
    double getAmount(Shape shape) {
        double area = shape.getArea();
        double amount = coverage/area; //not good at math. sorry :)
        return amount;
    }
}
