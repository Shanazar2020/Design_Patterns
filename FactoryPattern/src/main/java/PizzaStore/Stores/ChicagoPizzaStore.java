package main.java.PizzaStore.Stores;

import main.java.PizzaStore.IngredientsFactory.Factories.ChicagoPizzaIngredientFactory;
import main.java.PizzaStore.IngredientsFactory.Factories.PizzaIngredientsFactory;
import main.java.PizzaStore.Pizza.CheesePizza;
import main.java.PizzaStore.Pizza.ClamPizza;
import main.java.PizzaStore.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }

        return pizza;
    }
}
