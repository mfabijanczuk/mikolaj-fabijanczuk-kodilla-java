package com.kodilla.testing.shape;
import java.util.ArrayList;


public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ShapeCollector(){
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean removed = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            removed = true;
        }
        return removed;
    }
    public Shape getFigure(int n){
        return shapes.get(n);
    }
    public String showFigures(){
        return shapes.toString();
    }
    public int getArraySize(){
        return shapes.size();
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shapes=" + shapes +
                '}';
    }
}
