package CoffeeHouse.Product.Coffe;

import CoffeeHouse.Ingradients.CoffeeBeans;
import CoffeeHouse.Ingradients.Water;
import CoffeeHouse.Product.AbstractProduct;

/**
 * Created by vdohryk on 30.05.2016.
 */
public class Espresso extends AbstractCoffee {
    public Espresso(String name) {
        super(name);
    }

    public Espresso() {
        super("Espresso");
    }
}
