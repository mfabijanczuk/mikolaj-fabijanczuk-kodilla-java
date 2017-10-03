package com.kodilla.good.patterns.chalenges.Allegro;

import java.time.LocalDateTime;

public class BuyServiceImpl implements BuyService{

       @Override
    public boolean buy(Product product, AllegroUser allegroUser, LocalDateTime dateOfOrder) {
           System.out.println(allegroUser.getName() + " kupił " + product + ", data zakupu: " + dateOfOrder);
           return false;
    }
}
