package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class CarDealership {
    private CarPartFactory partFactory;

    public CarDealership(CarPartFactory partFactory){
        this.partFactory = partFactory;
    }
    public Car order(Color carColor, Color seatColor){
        Seat seat1 =  partFactory.buildSeat(seatColor);
        Seat seat2 = partFactory.buildSeat(seatColor);

        List<Seat> seats = new ArrayList<>();
        seats.add(seat1);
        seats.add(seat2);

        return new Car(partFactory.buildEngine(), seats, carColor);
    }
}
