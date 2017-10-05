package com.kodilla.good.patterns.chalenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producer{
    private List<Product> productList = new ArrayList();

    public HealthyShop(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }



    @Override
    public void process(Product product) {
        if(productList.contains(product)) {
            System.out.println("Zamowiłeś produkt " + product.getName() + " ze sklepu HealthyShop: " + " w cenie za sztukę: " + product.getPrize());
        }else {
            System.out.println("Brak produktu:" + product.getName() + " w sklepie HealthyShop" );
        }
    }
}
