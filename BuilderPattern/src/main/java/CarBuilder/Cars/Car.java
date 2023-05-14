package main.java.CarBuilder.Cars;

import lombok.Getter;
import lombok.Setter;
import main.java.CarBuilder.Components.Engine;
import main.java.CarBuilder.Components.GPSNavigator;
import main.java.CarBuilder.Components.Transmission;
import main.java.CarBuilder.Components.TripComputer;

public class Car {
    @Getter
    private final CarType carType;

    @Getter
    private final int seats;

    @Getter
    private final Engine engine;

    @Getter
    private final Transmission transmission;

    @Getter
    private final TripComputer tripComputer;

    @Getter
    private final GPSNavigator gpsNavigator;

    @Getter
    @Setter
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
            GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
}
