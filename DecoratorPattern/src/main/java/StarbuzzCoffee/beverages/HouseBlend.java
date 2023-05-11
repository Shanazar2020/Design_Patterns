package main.java.StarbuzzCoffee.beverages;

import main.java.StarbuzzCoffee.AbstractBeverage;

public class HouseBlend extends AbstractBeverage {

    public HouseBlend(){
        description = "House Blend";
    }
    @Override
    public double cost() {
        return .89;
    }
}
