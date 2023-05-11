package main.java.StarbuzzCoffee.contiments;

import main.java.StarbuzzCoffee.AbstractBeverage;
import main.java.StarbuzzCoffee.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private double cost;

    public Whip(AbstractBeverage beverage){
        this.beverage = beverage;
        this.setCost();
    }

    private void setCost(){
        switch (this.beverage.getSize()) {
            case TALL -> this.cost = 0.3;
            case MEDIUM -> this.cost = 0.25;
            case SMALL -> this.cost = .2;
        }
    }

    @Override
    public double cost() {
        return this.cost + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
