package AbstractFactory;

public class ConcreateSeat02 implements Seat {
    private Color color;

    public ConcreateSeat02(Color color){
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ConcreateSeat02{" +
                "color=" + color +
                '}';
    }
}
