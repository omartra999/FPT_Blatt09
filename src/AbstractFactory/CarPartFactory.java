package AbstractFactory;

public interface CarPartFactory {
    Engine buildEngine();
    Seat buildSeat(Color color);

}
