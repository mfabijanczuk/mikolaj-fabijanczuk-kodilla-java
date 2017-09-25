package com.kodilla.exeption.test;

public class ExceptionHandling {
    public static void main (String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(3.5, 4);

        } catch (Exception e) {

            System.out.println("No because x >= 2 || x < 1 || y == 1.5");

        }finally{

            System.out.println("End!");

        }
    }
}
