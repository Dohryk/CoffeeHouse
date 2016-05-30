package CoffeeHouse.Product;

import CoffeeHouse.Ingradients.AbstractIngredient;

/**
 * Created by vdohryk on 30.05.2016.
 */
public class AbstractProduct {

    String name;

    AbstractIngredient[] products = new AbstractIngredient[5];

    public void addIngredient(AbstractIngredient abstractIngredient) {

        for (int i = 0; i <5; i++){
            if (products[i]==null){
                products[i] = abstractIngredient;
                break;
            }
        }
    }

    public AbstractProduct(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        int price = 0;

        for (int i = 0; i < products.length && products[i] != null; i++){
            price += products[i].getPrice();
        }
        return price;
    }
}
