package com.kodilla.good.patterns.chalenges.AirTrafficController;

import java.util.HashSet;
import java.util.Set;

public class ConnectionList {

    private Set<Flight> listOfFlights = new HashSet<>();

    public ConnectionList() {
        listOfFlights.add(new Flight("Warszawa", "Katowice"));
        listOfFlights.add(new Flight("Warszawa", "Gdańsk"));
        listOfFlights.add(new Flight("Warszawa", "Kraków"));
        listOfFlights.add(new Flight("Warszawa", "Szczecin"));
        listOfFlights.add(new Flight("Gdańsk", "Kraków"));
        listOfFlights.add(new Flight("Gdańsk", "Katowice"));
        listOfFlights.add(new Flight("Katowice", "Warszawa"));
        listOfFlights.add(new Flight("Kraków", "Warszawa"));
        listOfFlights.add(new Flight("Gdańsk", "Warszawa"));
        listOfFlights.add(new Flight("Szczecin", "Kraków"));
        listOfFlights.add(new Flight("Kraków", "Gdańsk"));
        listOfFlights.add(new Flight("Karków", "Katowice"));
    }

    public Set<Flight> getListOfFlights() {
        return listOfFlights;
    }
}
