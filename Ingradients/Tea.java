package CoffeeHouse.Ingradients;

/**
 * Created by vdohryk on 30.05.2016.
 */
public class Tea extends AbstractIngredient {
    private KindOfTea kindOfTea;

    public Tea(KindOfTea kindOfTea){
        this.kindOfTea = kindOfTea;
        if (kindOfTea == KindOfTea.BlackTea) {
            setPrice(10.0);
        } else if (kindOfTea == KindOfTea.GreenTea){
            setPrice(11.0);
        } else {
            setPrice(13.0);
        }

    }
}
