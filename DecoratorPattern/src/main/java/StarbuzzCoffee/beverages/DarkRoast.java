package main.java.StarbuzzCoffee.beverages;

import main.java.StarbuzzCoffee.AbstractBeverage;
import main.java.StarbuzzCoffee.Size;

public class DarkRoast extends AbstractBeverage {

    public DarkRoast(){
        description = "Dark Roast";
    }

    public DarkRoast(Size size){
        description = "Dark Roast";
        super.setSize(size);
    }

    @Override
    public double cost() {
        return .99;
    }
}
