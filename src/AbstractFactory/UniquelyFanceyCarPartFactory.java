package AbstractFactory;

public class UniquelyFanceyCarPartFactory implements CarPartFactory {
    private static UniquelyFanceyCarPartFactory instance;

    private UniquelyFanceyCarPartFactory(){}

    public UniquelyFanceyCarPartFactory getInstance(){
        if (this.instance == null){
            return new UniquelyFanceyCarPartFactory();
        }
        return instance;
    }
    @Override
    public Engine buildEngine(){
        return new Engine() {
            @Override
            public int getNumberOfPistons() {
                return 17;
            }

            @Override
            public int getSize() {
                return 70;
            }

            @Override
            public int getFuelConsumption() {
                return 4;
            }
        };
    }

    @Override
    public Seat buildSeat(Color color){
    return new Seat() {
        @Override
        public Color getColor() {
            return color; }
    };
    }
}
