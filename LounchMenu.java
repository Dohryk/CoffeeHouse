package CoffeeHouse;

/**
 * Created by vdohryk on 30.05.2016.
 */
public class LounchMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();

        CoffeeHouseGUI coffeeHouseGUI = new CoffeeHouseGUI(menu);
        menu.printMenu();
    }
}
