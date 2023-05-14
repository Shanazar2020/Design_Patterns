package main.java.CarBuilder;

import main.java.CarBuilder.Builders.CarBuilder;
import main.java.CarBuilder.Builders.CarManualBuilder;
import main.java.CarBuilder.Cars.Car;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        director.constructSportsCar(manualBuilder);
        System.out.println("Car manual built:\n" + manualBuilder.getResult().print());

        director.constructCityCar(builder);
        car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        director.constructCityCar(manualBuilder);
        System.out.println("Car manual built:\n" + manualBuilder.getResult().print());

        director.constructSUV(builder);
        car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        director.constructSUV(manualBuilder);
        System.out.println("Car manual built:\n" + manualBuilder.getResult().print());
    }
}
