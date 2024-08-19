package AbstractFactory;

import java.util.List;

public class Car {
    private Engine engine;
    private List<Seat> seats;
    private Color carColor;

    public Car(Engine engine, List<Seat> seats, Color carColor){
        this.engine = engine;
        this.seats = seats;
        this.carColor = carColor;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Color getCarColor() {
        return carColor;
    }
    private void fuelUp(){
        System.out.println("tanked");
    }
    private boolean testDrive(){
        return true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", seats=" + seats +
                ", carColor=" + carColor +
                '}';
    }
}
