package AbstractFactory;

public class ConcreateSeat01 implements Seat{
    private Color color;

    public ConcreateSeat01(Color color){
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ConcreateSeat01{" +
                "color=" + color +
                '}';
    }
}
