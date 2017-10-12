package com.kodilla.good.patterns.chalenges.AirTrafficController;

public class ShowAvailableFlightsTo {

    ConnectionList connectionList = new ConnectionList();

    public void showAvailableFlightsTo(String airport) {
        System.out.println("Możliwe loty z lotniska " + airport + " :");
        connectionList.getListOfFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .map(flight -> flight.getArrivalAirport())
                .forEach(System.out::println);
    }
}