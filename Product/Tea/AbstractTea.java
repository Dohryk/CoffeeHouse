package CoffeeHouse.Product.Tea;

import CoffeeHouse.Ingradients.KindOfTea;
import CoffeeHouse.Ingradients.Tea;
import CoffeeHouse.Ingradients.Water;
import CoffeeHouse.Product.AbstractProduct;

/**
 * Created by vdohryk on 30.05.2016.
 */
public abstract class AbstractTea extends AbstractProduct {

    AbstractTea(String name, KindOfTea kindOfTea){
        super(name);
        addIngredient(new Water());
        addIngredient(new Tea(kindOfTea));
    }

}
