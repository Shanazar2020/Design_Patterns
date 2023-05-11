package main.java.StarbuzzCoffee.beverages;

import main.java.StarbuzzCoffee.AbstractBeverage;

public class Espresso extends AbstractBeverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
