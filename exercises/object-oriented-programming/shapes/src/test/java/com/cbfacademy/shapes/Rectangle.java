package com.cbfacademy.shapes;

public class Rectangle extends Shape{
    String name;
    double area;
    double length;
    double width;
    
    public Rectangle(String name, double area, double length, double width) {
        this.name = name;
        this.area = area;
        this.length = length;
        this.width = width;
    }//- constructor
    
    @Override
    public String getName(){
        this.name = "Rectangle";
        return name;
    }

    @Override
    public double getArea() {
        area = (length*width);
        return area;

    }
}
