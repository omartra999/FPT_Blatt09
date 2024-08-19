package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Runnable task01 = () -> {
            CarPartFactory fancyfactory = UniquelyFanceyCarPartFactory.getInstance();
             Seat seat1 = fancyfactory.buildSeat(Color.BLACK);
             Seat seat2 = fancyfactory.buildSeat(Color.BLACK);

            List<Seat> seats = new ArrayList<>();
            seats.add(seat1);
            seats.add(seat2);

            Car fancyCar = new Car(fancyfactory.buildEngine(), seats, Color.BLUE);
            System.out.println(fancyCar);
        };

        Runnable task02 = () -> {
            CarPartFactory fancyfactory = UniquelyFanceyCarPartFactory.getInstance();
            Seat seat1 = fancyfactory.buildSeat(Color.BLACK);
            Seat seat2 = fancyfactory.buildSeat(Color.BLACK);

            List<Seat> seats = new ArrayList<>();
            seats.add(seat1);
            seats.add(seat2);

            Car fancyCar = new Car(fancyfactory.buildEngine(), seats, Color.BLACK);
            System.out.println(fancyCar);
        };

        Thread thread1 = new Thread(task01);
        Thread thread2 = new Thread(task02);

        thread1.start();
        thread2.start();
    }
}
