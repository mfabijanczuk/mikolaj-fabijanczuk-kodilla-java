package com.kodilla.good.patterns.chalenges.AirTrafficController;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ShowAvailableConnectingFlights {

    ConnectionList connectionList = new ConnectionList();

    public void showAvailableConnectingFlights(String fromAirport, String byAirport, String toAirport) {
        System.out.println("Czy jest możliwy lot łączony z lotniska " + fromAirport + " przez " + byAirport + " do lotniska " + toAirport + " ?");
        Set<Flight> fromAirportByAirport = connectionList.getListOfFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(fromAirport))
                .filter(flight -> flight.getArrivalAirport().equals(byAirport))
                .collect(Collectors.toSet());
        if(fromAirportByAirport.isEmpty()){
            System.out.println("Nie jest możliwy lot z " + fromAirport + " do " + byAirport + " więc nie jest też możliwy do " + toAirport);
        }else {
            System.out.println("Jest możliwy lot z " + fromAirport + " do " + byAirport);

            Set<Flight> byAirportToAirport = connectionList.getListOfFlights().stream()
                    .filter(flight -> flight.getDepartureAirport().equals(byAirport))
                    .filter(flight -> flight.getArrivalAirport().equals(toAirport))
                    .collect(Collectors.toSet());

            if (byAirportToAirport.isEmpty()) {
                System.out.println("ale nie jest możliwy lot z " + byAirport + " do " + toAirport);
            } else {
                System.out.println("Jest możliwy lot z " + byAirport + " do " + toAirport);
            }
        }
    }
}
