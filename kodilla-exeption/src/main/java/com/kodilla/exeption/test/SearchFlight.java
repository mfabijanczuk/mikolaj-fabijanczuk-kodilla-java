package com.kodilla.exeption.test;

import java.util.HashMap;

public class SearchFlight {

    public Boolean findFlight(Flight flight)throws RouteNotFoundException {

        HashMap<String, Boolean> mapFlight = new HashMap<>();
        mapFlight.put("Warszawa", true);
        mapFlight.put("Kraków", false);

        Boolean availableFlight = mapFlight.get(flight.getArrivalAirport());

        if(flight == null || availableFlight == false) {
            throw new RouteNotFoundException("Nie ma takiego połączenia");
        }
        return availableFlight;
    }
}
