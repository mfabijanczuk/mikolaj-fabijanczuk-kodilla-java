package com.kodilla.good.patterns.chalenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorRunner {
    public static void main(String[] args) {
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("piwo", 5));
        listOfProducts.add(new Product("chleb", 2));
        listOfProducts.add(new Product("mąka", 3));
        listOfProducts.add(new Product("dynia", 4));
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(listOfProducts);
        OrderRetriver orderRetriver = new OrderRetriver();
        Order order = orderRetriver.retrive();
        ProductOrderService productOrderService = new ProductOrderService(glutenFreeShop);
        productOrderService.process(order);
    }
}
