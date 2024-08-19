package AbstractFactory;

public class ConcretePartFactory01 implements CarPartFactory {

    @Override
    public Engine buildEngine(){
        return new Engine() {
            @Override
            public int getNumberOfPistons() {
                return 6;
            }

            @Override
            public int getSize() {
                return 11000;
            }

            @Override
            public int getFuelConsumption() {
                return 154889;
            }
        };
    }

    @Override
    public Seat buildSeat(Color color){
        return new Seat() {
            @Override
            public Color getColor() {
                return color;
            }
        };
    }
}
