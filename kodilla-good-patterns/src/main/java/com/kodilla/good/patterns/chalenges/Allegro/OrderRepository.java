package com.kodilla.good.patterns.chalenges.Allegro;

import java.time.LocalDateTime;

public interface OrderRepository {
    public void createOrder(AllegroUser allegroUser, Product product, LocalDateTime dateOfOrder);
}
