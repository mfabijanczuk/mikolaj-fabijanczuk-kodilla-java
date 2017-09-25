package com.kodilla.exeption.test;

public class FlightExceptionRunner {
    public static void main(String[] args){
        SearchFlight searchFlight = new SearchFlight();
        Flight flight = new Flight("Gdańsk", "Kraków");

        try{
            searchFlight.findFlight(flight);
            System.out.println("There is a flight to: " + flight);
        }catch (RouteNotFoundException e){
            System.out.println("There is no flight.");
        }finally {
            System.out.println("End.");
        }
    }
}
