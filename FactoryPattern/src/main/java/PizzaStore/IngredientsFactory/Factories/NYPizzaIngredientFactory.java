package main.java.PizzaStore.IngredientsFactory.Factories;

import main.java.PizzaStore.IngredientsFactory.Ingredients.Cheese.Cheese;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Cheese.ReggianoCheese;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Clams.Clams;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Clams.FreshClams;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Dough.Dough;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Dough.ThickCrustDough;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Sauce.MarinaraSauce;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientsFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
