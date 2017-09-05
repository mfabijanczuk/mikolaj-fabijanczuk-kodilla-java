package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumberExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumberExterminator exterminatorTest1 = new OddNumberExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> oddNumberTest1 = exterminatorTest1.exterminate(numbers);
        //When

        //Then
        for (int a : oddNumberTest1) {
            Assert.assertTrue(a % 2 == 0);
        }
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumberExterminator exterminatorTest2 = new OddNumberExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> oddNumberTest2 = exterminatorTest2.exterminate(numbers);
        //When
        for(int a = 0; a < 100; a++) {
            numbers.add(1);
            numbers.add(0);
            numbers.add(4);
            numbers.add(5);
            numbers.add(9);
            numbers.add(1);
            numbers.add(3);
            numbers.add(2);
            numbers.add(10);


        }
        //Then
        for (int a : oddNumberTest2) {
            Assert.assertTrue(a % 2 == 0);
            System.out.print(a);
        }
    }
}
