package com.kodilla.good.patterns.chalenges.Allegro;

import java.time.LocalDateTime;

public class OrderRequest {
    public AllegroUser allegroUser;
    public Product product;
    public LocalDateTime dateOfOrder;

    public OrderRequest(AllegroUser allegroUser, Product product, LocalDateTime dateOfOrder) {
        this.allegroUser = allegroUser;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
    }

    public AllegroUser getAllegroUser() {
        return allegroUser;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }
}
