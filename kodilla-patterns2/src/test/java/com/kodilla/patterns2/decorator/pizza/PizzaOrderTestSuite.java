package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testDoubleAdditionalCheseWithMeatGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalCheeseDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        theOrder = new AddMeatDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(34), theCost);
    }

    @Test
    public void testDoubleAdditionalCheseWithMeatGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalCheeseDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        theOrder = new AddMeatDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza Margherita + additional cheese + additional cheese with meat", description);
    }
}

