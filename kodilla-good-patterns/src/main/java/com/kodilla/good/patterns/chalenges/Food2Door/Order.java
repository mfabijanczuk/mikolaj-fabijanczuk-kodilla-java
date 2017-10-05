package com.kodilla.good.patterns.chalenges.Food2Door;

import com.kodilla.good.patterns.chalenges.Allegro.AllegroUser;

import java.time.LocalDateTime;

public class Order {
    private Client client;
    private Product product;
    private double quantity;
    private LocalDateTime dateOfOrder;
    private boolean ifBuy;

    public Order(Client client, Product product, double quantity, LocalDateTime dateOfOrder, boolean ifBuy) {
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.dateOfOrder = dateOfOrder;
        this.ifBuy = ifBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }


    public Client getClient() {
        return client;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public boolean isIfBuy() {
        return ifBuy;
    }

    public double getOrderValue() {
        return product.getPrize() * quantity;
    }
}
