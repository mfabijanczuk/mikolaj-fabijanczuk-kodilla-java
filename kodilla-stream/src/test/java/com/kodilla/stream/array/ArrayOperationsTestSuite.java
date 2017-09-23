package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] listOfNumbers = {1, 2, 5, 8, 12, 14, 16};

        //When
        double average = ArrayOperation.getAverage(listOfNumbers);

        //Then
        Assert.assertEquals(8.29, average, 0.01);
    }
}
