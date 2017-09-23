package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;


public class WorldTestSuite {
    @Test
        public void testGetPeopleQuantity() {
        //Given
        //Create Country
        //Europe
        Country poland = new Country(new BigDecimal("40000000"));
        Country germany = new Country(new BigDecimal("50000000"));
        Country france = new Country(new BigDecimal("60000000"));
        //Asia
        Country china = new Country(new BigDecimal("1300000000"));
        Country japan = new Country(new BigDecimal("30000000"));
        Country russia = new Country(new BigDecimal("100000000"));
        //Africa
        Country egypt = new Country(new BigDecimal("60000000"));
        Country zimbabwe = new Country(new BigDecimal("30000000"));
        Country sudan = new Country(new BigDecimal("25000000"));
        //Creating continents
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(russia);
        africa.addCountry(egypt);
        africa.addCountry(zimbabwe);
        africa.addCountry(sudan);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal totalNumberOfPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedNumberOfPeople = new BigDecimal("1695000000");
        Assert.assertEquals(expectedNumberOfPeople, totalNumberOfPeople);
    }
}
