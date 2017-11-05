package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(11.1, 12.2);
        double sub = calculator.sub(12.2, 11.1);
        double mul = calculator.mul(11.1, 12.2);
        double div = calculator.div(12.6, 3.2);
        //Then
        Assert.assertEquals(sum,23.3,0.01);
        Assert.assertEquals(sub,1.1,0.01);
        Assert.assertEquals(mul,135.42,0.01);
        Assert.assertEquals(div,3.94,0.01);
    }
}
