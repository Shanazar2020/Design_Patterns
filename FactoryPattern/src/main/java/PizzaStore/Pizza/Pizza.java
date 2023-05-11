package main.java.PizzaStore.Pizza;

import main.java.PizzaStore.IngredientsFactory.Ingredients.Cheese.Cheese;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Clams.Clams;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Dough.Dough;
import main.java.PizzaStore.IngredientsFactory.Ingredients.Sauce.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }


}
