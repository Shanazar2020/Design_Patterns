package main.java.StarbuzzCoffee;

import main.java.StarbuzzCoffee.beverages.DarkRoast;
import main.java.StarbuzzCoffee.contiments.Soy;
import main.java.StarbuzzCoffee.contiments.Whip;

public class Main {
    public static void main(String[] args) {
        AbstractBeverage beverage = new DarkRoast(Size.TALL);

        System.out.println("Normal cost of " + beverage.getDescription() + " $ " + beverage.cost());

        beverage = new Soy(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);

        System.out.println("After changing: " +  beverage.getDescription() + " $ " + beverage.cost());
//        System.out.println("Hello world!");
    }
}