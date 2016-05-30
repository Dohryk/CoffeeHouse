package CoffeeHouse;

import CoffeeHouse.Product.AbstractProduct;
import CoffeeHouse.Product.Coffe.Americano;
import CoffeeHouse.Product.Coffe.Capuchino;
import CoffeeHouse.Product.Coffe.Espresso;
import CoffeeHouse.Product.Coffe.Latte;
import CoffeeHouse.Product.Tea.BlackTea;
import CoffeeHouse.Product.Tea.GreenTea;
import CoffeeHouse.Product.Tea.TeaWithBergamont;

/**
 * Created by vdohryk on 30.05.2016.
 */
public class Menu {

    private AbstractProduct[] products = new AbstractProduct[7];
    Menu(){
        products[0] = new Americano();
        products[1] = new Capuchino();
        products[2] = new Espresso();
        products[3] = new Latte();
        products[4] = new BlackTea();
        products[5] = new GreenTea();
        products[6] = new TeaWithBergamont();
    }

    public void printMenu(){
        System.out.println("-------------MENU-------------");
        for (int i=0; i< products.length; i++){
            System.out.println(products[i].getName() + " - " + products[i].getPrice() + " UAH");
        }
    }
}
