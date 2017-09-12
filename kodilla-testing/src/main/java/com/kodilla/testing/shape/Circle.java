package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double r;

    public Circle(String name, double r){
        this.name = name;
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return r * r * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", r=" + r +
                '}';
    }
}
