package AbstractFactory;

public class UniquelyFanceyCarPartFactory implements CarPartFactory {
    private static UniquelyFanceyCarPartFactory instance;

    private UniquelyFanceyCarPartFactory(){}

    public static synchronized UniquelyFanceyCarPartFactory getInstance(){
        if (instance == null){
            instance = new UniquelyFanceyCarPartFactory();
        }
        return instance;
    }
    @Override
    public Engine buildEngine(){
        return new ConcreateEngine01(48,6,1);
    }

    @Override
    public Seat buildSeat(Color color){
    return new ConcreateSeat01(Color.BLACK);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
