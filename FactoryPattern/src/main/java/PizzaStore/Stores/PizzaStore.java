package main.java.PizzaStore.Stores;

import main.java.PizzaStore.Pizza.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);

    public void orderPizza(String item){
        Pizza pizza;
        pizza = createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
