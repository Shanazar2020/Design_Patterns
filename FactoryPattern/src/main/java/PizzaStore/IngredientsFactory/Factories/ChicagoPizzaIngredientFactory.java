package main.java.PizzaStore.IngredientsFactory.Factories;

import main.java.PizzaStore.IngredientsFactory.Ingredients.Cheese.Cheese;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Cheese.MozzarellaCheese;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Clams.Clams;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Clams.FreshClams;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Clams.FrozenClams;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Dough.Dough;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Dough.ThinCrustDough;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Sauce.PlumTomatoSauce;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientsFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
