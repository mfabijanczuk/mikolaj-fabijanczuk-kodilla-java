package com.kodilla.good.patterns.chalenges.Allegro;

import com.kodilla.good.patterns.chalenges.Allegro.AllegroUser;
import com.kodilla.good.patterns.chalenges.Allegro.Product;

import java.time.LocalDateTime;

public interface BuyService {
    public boolean buy(Product product, AllegroUser allegroUser, LocalDateTime dateOfOrder);

}
