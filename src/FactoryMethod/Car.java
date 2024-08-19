package FactoryMethod;


import java.util.List;

public interface Car {
     Engine getEngine();
     List<Seat> getSeats();
     Color getColor();
     void fuelUp();
     boolean testDrive();

}
