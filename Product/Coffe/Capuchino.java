package CoffeeHouse.Product.Coffe;

import CoffeeHouse.Ingradients.CoffeeBeans;
import CoffeeHouse.Ingradients.Milk;
import CoffeeHouse.Ingradients.Water;

/**
 * Created by vdohryk on 30.05.2016.
 */
public class Capuchino extends Espresso {
    public Capuchino() {
        super("Capuchino");
        addIngredient(new Milk());
    }
}
