package AbstractFactory;

public class ConcretePartFactory02 implements CarPartFactory {

    @Override
    public Engine buildEngine() {
        return new Engine() {
            @Override
            public int getNumberOfPistons() {
                return 19;
            }

            @Override
            public int getSize() {
                return 700;
            }

            @Override
            public int getFuelConsumption() {
                return 77777;
            }
        };
    }

    @Override
    public Seat buildSeat(Color color) {
        return new Seat() {
            @Override
            public Color getColor() {
                return color;
            }
        };
    }
}
