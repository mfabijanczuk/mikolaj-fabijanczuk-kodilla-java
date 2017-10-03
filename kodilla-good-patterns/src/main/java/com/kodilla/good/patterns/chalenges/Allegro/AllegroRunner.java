package com.kodilla.good.patterns.chalenges.Allegro;

public class AllegroRunner {
    public static void main (String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();

        ProductOrderService productOrderService = new ProductOrderService(new InformationServiceImpl(), new BuyServiceImpl(), new OrderRepositoryImpl());
        productOrderService.process(orderRequest);

    }
}