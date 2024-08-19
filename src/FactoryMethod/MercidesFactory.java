package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class MercidesFactory extends CarFactory {
    @Override
    public Car build(Color color, Color seatColor){
        return new MercidesCar(color,seatColor);
    }
}
