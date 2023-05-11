package main.java.PizzaStore.Pizza;

import main.java.PizzaStore.IngredientsFactory.Factories.PizzaIngredientsFactory;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Clams.Clams;

public class ClamPizza extends Pizza{
    PizzaIngredientsFactory ingredientsFactory;

    public ClamPizza(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        cheese = ingredientsFactory.createCheese();
        clams = ingredientsFactory.createClams();
    }
}
