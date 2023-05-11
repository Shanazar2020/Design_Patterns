package main.java.PizzaStore.Stores;

import main.java.PizzaStore.IngredientsFactory.Factories.NYPizzaIngredientFactory;
import main.java.PizzaStore.IngredientsFactory.Factories.PizzaIngredientsFactory;
import main.java.PizzaStore.Pizza.CheesePizza;
import main.java.PizzaStore.Pizza.ClamPizza;
import main.java.PizzaStore.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
