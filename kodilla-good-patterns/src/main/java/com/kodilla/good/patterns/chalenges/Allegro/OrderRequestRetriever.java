package com.kodilla.good.patterns.chalenges.Allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrive() {
        Product product = new Product("Think in Java", "87");
        AllegroUser allegroUser = new AllegroUser("Mikołaj", "mikolaj@com.pl");
        LocalDateTime timeOfOrder = LocalDateTime.of(2017, 10, 3, 21, 18, 31);
        return new OrderRequest(allegroUser, product, timeOfOrder);
    }
}
