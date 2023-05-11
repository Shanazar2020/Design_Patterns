package main.java.StarbuzzCoffee.contiments;

import main.java.StarbuzzCoffee.AbstractBeverage;
import main.java.StarbuzzCoffee.CondimentDecorator;

public class Soy  extends CondimentDecorator {
    private double cost;
    public Soy(AbstractBeverage beverage){
        this.beverage = beverage;
        this.setSize(beverage.getSize());
        this.setCost();
    }

    private void setCost(){
        switch (this.beverage.getSize()) {
            case TALL -> this.cost = 0.2;
            case MEDIUM -> this.cost = 0.15;
            case SMALL -> this.cost = .1;
        }
    }

    @Override
    public double cost() {
        return this.cost + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
