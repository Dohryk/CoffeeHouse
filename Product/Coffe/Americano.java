package CoffeeHouse.Product.Coffe;

import CoffeeHouse.Ingradients.CoffeeBeans;
import CoffeeHouse.Ingradients.Water;

/**
 * Created by vdohryk on 30.05.2016.
 */
public class Americano extends AbstractCoffee {

    Americano(String name) {
        super(name);
        addIngredient(new Water());
    }

    public Americano() {
        super("Americano");
        addIngredient(new Water());
    }
}
