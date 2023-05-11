package main.java.StarbuzzCoffee;

public abstract class AbstractBeverage {
    protected Size size = Size.MEDIUM;
    protected String description = "Unknown Description";

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
