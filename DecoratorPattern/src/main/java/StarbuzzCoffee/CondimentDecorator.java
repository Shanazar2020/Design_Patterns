package main.java.StarbuzzCoffee;

public abstract class CondimentDecorator extends AbstractBeverage {
    protected AbstractBeverage beverage;
    public abstract String getDescription();
}
