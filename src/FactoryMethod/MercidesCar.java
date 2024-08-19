package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class MercidesCar implements Car {
private Color carColor;
private Color seatColor;
private boolean testDrive;

public MercidesCar(Color carColor, Color seatColor){
    this.carColor = carColor;
    this.seatColor = seatColor;
    this.testDrive = false;
}

    @Override
    public Engine getEngine() {
        return new ConcreteEngine();
    }

    @Override
    public List<Seat> getSeats() {
        Seat seat = new Seat() {
            @Override
            public Color getColor() {
                return seatColor;
            }

        };
        List<Seat> seats = new ArrayList<>();
        seats.add(seat);
        return seats;
    }

    @Override
    public Color getColor() {
        return carColor;
    }

    @Override
    public void fuelUp() {
        System.out.println("Tanked");
    }

    @Override
    public boolean testDrive() {
        this.testDrive = true;
        return this.testDrive;
    }

    @Override
    public String toString() {
        return "MercidesCar{" +
                "carColor=" + carColor +
                ", seatColor=" + seatColor +
                ", testDrive=" + testDrive +
                '}';
    }
}
