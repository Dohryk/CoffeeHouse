package CoffeeHouse;

import CoffeeHouse.Product.AbstractProduct;
import CoffeeHouse.Product.Coffe.Americano;
import CoffeeHouse.Product.Coffe.Capuchino;
import CoffeeHouse.Product.Coffe.Espresso;
import CoffeeHouse.Product.Coffe.Latte;
import CoffeeHouse.Product.Tea.BlackTea;
import CoffeeHouse.Product.Tea.GreenTea;
import CoffeeHouse.Product.Tea.TeaWithBergamont;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdohryk on 30.05.2016.
 */
public class Menu {

    private List<AbstractProduct> products = new ArrayList<AbstractProduct>();

    Menu(){
        products.add(new Americano());
        products.add(new Capuchino());
        products.add(new Espresso());
        products.add(new Latte());
        products.add(new BlackTea());
        products.add(new GreenTea());
        products.add(new TeaWithBergamont());
    }

    public void printMenu(){
        System.out.println("-------------MENU-------------");
        for (AbstractProduct product : products){
            System.out.println(product.getName() + " - " + product.getPrice() + " UAH");
        }
    }

    public List<AbstractProduct> getProducts() {
        return products;
    }
}
