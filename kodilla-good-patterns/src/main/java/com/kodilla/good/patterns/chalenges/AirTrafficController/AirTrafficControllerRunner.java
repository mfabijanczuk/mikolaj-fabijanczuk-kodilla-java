package com.kodilla.good.patterns.chalenges.AirTrafficController;
import java.util.HashMap;

public class AirTrafficControllerRunner {
    public static void main(String[] args) {
       ShowAvailableFlightsTo showAvailableFlightsTo = new ShowAvailableFlightsTo();
       showAvailableFlightsTo.showAvailableFlightsTo("Warszawa");
       ShowAvailableFlightsFrom showAvailableFlightsFrom = new ShowAvailableFlightsFrom();
       showAvailableFlightsFrom.showAvailableFlightsFrom("Kraków");
       ShowAvailableConnectingFlights showAvailableConnectingFlights = new ShowAvailableConnectingFlights();
       showAvailableConnectingFlights.showAvailableConnectingFlights("Warszawa","Kraków","Szczecin");

    }
}
