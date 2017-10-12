package com.kodilla.good.patterns.chalenges.AirTrafficController;

public class ShowAvailableFlightsFrom {

    ConnectionList connectionList = new ConnectionList();

    public void showAvailableFlightsFrom(String airport) {
        System.out.println("Możliwe przyloty na lotnisko " + airport + " :");
        connectionList.getListOfFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport))
                .map(flight -> flight.getDepartureAirport())
                .forEach(System.out::println);
    }
}
