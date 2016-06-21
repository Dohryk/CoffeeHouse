package CoffeeHouse;

import CoffeeHouse.Product.AbstractProduct;

/**
 * Created by vdohryk on 21.06.2016.
 */
public class Transaction {

    private Customer client;
    private AbstractProduct product;
    private int count;
    private double summ;

    Transaction(Customer client, AbstractProduct abstractProduct, int count){
        this.client = client;
        this.product = abstractProduct;
        this.count = count;
        this.summ = count * abstractProduct.getPrice();
    }

    public void printTransaction(){
        System.out.println("Client - " + client.getName() + " " + product.getName() + " " + count + " " + summ);
    }
}
