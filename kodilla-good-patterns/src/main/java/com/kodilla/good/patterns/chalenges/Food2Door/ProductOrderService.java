package com.kodilla.good.patterns.chalenges.Food2Door;

public class ProductOrderService {
    private Producer producer;

    public ProductOrderService(Producer producer) {
        this.producer = producer;
    }

    public Order process (final Order order) {
        producer.process(order.getProduct());
        return order;
    }
}
