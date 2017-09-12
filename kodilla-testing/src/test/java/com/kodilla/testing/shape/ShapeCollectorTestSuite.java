package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import javafx.beans.binding.When;
import org.junit.*;
import java.util.ArrayList;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle circle = new Circle("Circle 1", 3);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Shape resultFigure = shapeCollector.getFigure(0);
        Assert.assertEquals(circle, resultFigure);
    }

    @Test
    public void testRemoveNotExistingFigure(){
        //Given
        Triangle triangle = new Triangle("Triangle 1", 3, 3);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //This
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveExistingFigure() {
        //Given
        Square square = new Square("Square 1", 3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //This
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getArraySize());
    }

    @Test
    public void testGetFigure(){
        //Given
        Circle circle = new Circle("Circle 1", 3);
        Square square = new Square("Square 1", 3);
        Triangle triangle = new Triangle("Triangle 1", 3, 3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        Shape retrivedShape = shapeCollector.getFigure(0);
        //This
        Assert.assertEquals(circle, retrivedShape);
    }

    @Test
    public void testShowFigure(){
        //Given
        Circle circle = new Circle("Circle 1", 3);
        Square square = new Square("Square 1", 3);
        Triangle triangle = new Triangle("Triangle 1", 3, 3);
        //When
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        ArrayList<Shape> testShapes = new ArrayList<Shape>();
        testShapes.add(circle);
        testShapes.add(square);
        testShapes.add(triangle);
        //This
        Assert.assertEquals(shapeCollector.showFigures(), testShapes.toString());
    }
}
