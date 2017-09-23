package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> continent = new ArrayList<Country>();

    public void addCountry (Country country){
        continent.add(country);
    }
    public List<Country> getListOfCountries(){
        return continent;
    }


}
