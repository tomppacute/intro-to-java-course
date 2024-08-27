package com.cbfacademy.shapes;

public class Sphere extends Shape{
    String name;
    double area;
    double radius;
    
    public Sphere(String name, double area, double radius) {
        this.name = name;
        this.area = area;
        this.radius = radius;
    }//- constructor
    
    @Override
    public String getName(){
        this.name = "Sphere";
        return name;
    }

    @Override
    public double getArea() {
        area = (4 * 3.14159 * (radius*radius));
        return area;

    }//- overrides the base method. The value is given by the formula (4 * 𝛑 * (radius2))
}
