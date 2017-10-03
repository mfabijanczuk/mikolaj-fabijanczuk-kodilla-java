package com.kodilla.good.patterns.chalenges.Allegro;

public class ProductOrderService {

    private InformationServiceImpl informationServiceImpl;
    private BuyServiceImpl buyServiceImpl;
    private OrderRepositoryImpl orderRepositoryImpl;

    public ProductOrderService(InformationServiceImpl informationServiceImpl, BuyServiceImpl buyServiceImpl, OrderRepositoryImpl orderRepositoryImpl) {
        this.informationServiceImpl = informationServiceImpl;
        this.buyServiceImpl = buyServiceImpl;
        this.orderRepositoryImpl = orderRepositoryImpl;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = buyServiceImpl.buy(orderRequest.getProduct(),orderRequest.getAllegroUser(), orderRequest.getDateOfOrder());
        if (isOrdered) {
            informationServiceImpl.sendMail(orderRequest.getAllegroUser(), orderRequest.getProduct());
            orderRepositoryImpl.createOrder(orderRequest.getAllegroUser(), orderRequest.getProduct(), orderRequest.getDateOfOrder());
            return new OrderDTO(orderRequest.getAllegroUser(), orderRequest.getProduct(), orderRequest.getDateOfOrder(), true);

        }else{
            return new OrderDTO(orderRequest.getAllegroUser(), orderRequest.getProduct(), orderRequest.getDateOfOrder(), false);

        }

    }
}