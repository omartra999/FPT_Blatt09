package AbstractFactory;

public class ConcretePartFactory01 implements CarPartFactory {

    @Override
    public Engine buildEngine(){
        return new ConcreateEngine01(14, 46, 8);
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

    @Override
    public String toString() {
        return super.toString();
    }
}
