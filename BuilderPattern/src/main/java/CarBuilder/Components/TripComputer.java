package main.java.CarBuilder.Components;

import lombok.Setter;
import main.java.CarBuilder.Cars.Car;

public class TripComputer {
    @Setter
    private Car car;

    public void showFuelLevel(){
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus(){
        if(this.car.getEngine().isStarted()){
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }

}
