import main.java.PizzaStore.Stores.ChicagoPizzaStore;
import main.java.PizzaStore.Stores.NYPizzaStore;
import main.java.PizzaStore.Stores.PizzaStore;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");


        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("clam");
    }
}