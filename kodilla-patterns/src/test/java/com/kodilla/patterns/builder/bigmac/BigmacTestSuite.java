package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient(Bigmac.BACON)
                .ingredient(Bigmac.CHILLI_PEPPER)
                .sauce(Bigmac.THOUSAND_ISLANDS)
                .ingredient(Bigmac.CUCUMBER)
                .roll(Bigmac.WITHOUT_SESAME)
                .burgers(2)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
    }
}
