package com.cbfacademy.shapes;

public class Cylinder extends Shape{
    String name;
    double area;
    double radius;
    double height;
    
    public Cylinder(String name, double area, double radius, double height) {
        this.name = name;
        this.area = area;
        this.radius = radius;
        this.height = height;
    }//- constructor
    
    @Override
    public String getName(){
        this.name = "Cylinder";
        return name;
    }

    @Override
    public double getArea() {
        area = (height * 3.14159 * (radius*radius));
        return area;

    }
}
