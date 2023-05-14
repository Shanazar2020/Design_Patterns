package main.java.CarBuilder.Builders;

import main.java.CarBuilder.Cars.CarType;
import main.java.CarBuilder.Components.Engine;
import main.java.CarBuilder.Components.GPSNavigator;
import main.java.CarBuilder.Components.Transmission;
import main.java.CarBuilder.Components.TripComputer;

public interface Builder {
    void reset();
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
