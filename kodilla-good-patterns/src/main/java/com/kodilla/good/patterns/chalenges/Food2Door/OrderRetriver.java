package com.kodilla.good.patterns.chalenges.Food2Door;

import java.time.LocalDateTime;

public class OrderRetriver {
    public Order retrive() {
        Product product = new Product("chleb", 2.5);
        Client client = new Client("Mikołaj", "F");
        double quantity = 2;
        LocalDateTime dateOfOrder = LocalDateTime.now();
        boolean ifBuy = true;
        return new Order(client, product, quantity, dateOfOrder, ifBuy);
    }
}
