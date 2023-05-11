package main.java.PizzaStore.IngredientsFactory.Factories;

import main.java.PizzaStore.IngredientsFactory.Ingredients.Cheese.Cheese;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Clams.Clams;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Dough.Dough;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Sauce.Sauce;

public interface PizzaIngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();

}
