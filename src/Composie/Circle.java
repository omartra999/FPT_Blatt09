package Composie;

public class Circle implements Shape {
    private int x;
    private int y;
    private int raduis;

    public Circle(int x, int y, int raduis){
        this.x = x;
        this.y = y;
        this.raduis = raduis;
    }

    @Override
    public double getSurface(){
        return (2 * 3.14 * raduis);
    }

    @Override
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getRaduis() {
        return raduis;
    }

    public void setRaduis(int raduis) {
        this.raduis = raduis;
    }
}
