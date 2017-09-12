package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name;
    private double base;
    private double haight;

    public Triangle(String name, double base, double haight){
        this.name = name;
        this.base = base;
        this.haight = haight;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return base * haight / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", base=" + base +
                ", haight=" + haight +
                '}';
    }
}
