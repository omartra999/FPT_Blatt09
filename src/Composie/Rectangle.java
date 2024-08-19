package Composie;


public class Rectangle implements Shape {
    private int x;
    private int y;
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height){
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getSurface(){
        return width * height;
    }

    @Override
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
