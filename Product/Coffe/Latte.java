package CoffeeHouse.Product.Coffe;

import CoffeeHouse.Ingradients.CoffeeBeans;
import CoffeeHouse.Ingradients.Milk;
import CoffeeHouse.Ingradients.Sugar;
import CoffeeHouse.Ingradients.Water;

/**
 * Created by vdohryk on 30.05.2016.
 */
public class Latte extends Americano {
    public Latte() {
        super("Latte");
        addIngredient(new Milk());
        addIngredient(new Sugar());
    }
}
