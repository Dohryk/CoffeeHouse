package CoffeeHouse.Product.Coffe;

import CoffeeHouse.Ingradients.CoffeeBeans;
import CoffeeHouse.Ingradients.Water;
import CoffeeHouse.Product.AbstractProduct;

/**
 * Created by vdohryk on 30.05.2016.
 */
public abstract class AbstractCoffee extends AbstractProduct {

    AbstractCoffee(String name){

        super(name);
        addIngredient(new Water());
        addIngredient(new CoffeeBeans());
    }

}
