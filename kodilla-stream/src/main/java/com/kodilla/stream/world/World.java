package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> world = new ArrayList<Continent>();

    public void addContinent (Continent continent){
        world.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal worldNumberOfPeople = world.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldNumberOfPeople;
    }
}
