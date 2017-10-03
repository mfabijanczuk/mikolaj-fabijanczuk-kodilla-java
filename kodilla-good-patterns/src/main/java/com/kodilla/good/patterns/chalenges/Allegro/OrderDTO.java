package com.kodilla.good.patterns.chalenges.Allegro;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.time.LocalDateTime;

public class OrderDTO {
    public AllegroUser allegroUser;
    public LocalDateTime dateOfOrder;
    public Product product;
    public boolean ifBuy;

    public OrderDTO(AllegroUser allegroUser, Product product, LocalDateTime dateOfOrder, boolean ifBuy) {
        this.allegroUser = allegroUser;
        this.dateOfOrder = dateOfOrder;
        this.product = product;
        this.ifBuy = ifBuy;
    }

    public Product getProduct() {
        return product;
    }


    public AllegroUser getAllegroUser() {
        return allegroUser;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public boolean isIfBuy() {
        return ifBuy;
    }
}
