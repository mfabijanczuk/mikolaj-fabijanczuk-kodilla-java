package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Item item1 = new Item(new BigDecimal(333),1);
        Item item2 = new Item(new BigDecimal(222),1);
        Item item3 = new Item(new BigDecimal(111),1);

        Product product1 = new Product("Sushi");
        Product product2 = new Product("Piwo");
        Product product3 = new Product("Wódka");

        Invoice invoice1 = new Invoice("123");
        Invoice invoice2 = new Invoice("124");
        Invoice invoice3 = new Invoice("125");

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice2);
        item3.setInvoice(invoice3);

        invoice1.getItems().add(item1);
        invoice2.getItems().add(item2);
        invoice3.getItems().add(item3);

        //When
        invoiceDao.save(invoice1);
        int id1 = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, id1);

        //CleanUp
        //taskListDao.delete(id1);
    }
}
