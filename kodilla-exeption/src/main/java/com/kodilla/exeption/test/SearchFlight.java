package com.kodilla.exeption.test;

import java.util.HashMap;

public class SearchFlight {

    HashMap<String, Boolean> mapFlight = new HashMap<>();

    public void findFlight(Flight flight)throws RouteNotFoundException{
        throw new RouteNotFoundException("Nie ma takiego połączenia");
    }


}
