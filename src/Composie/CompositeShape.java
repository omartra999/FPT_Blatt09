package Composie;


import java.util.List;

public class CompositeShape implements Shape {
    private List<Shape> shapes ;

    public CompositeShape(List<Shape> shapes){
        this.shapes = shapes;
    }

    @Override
    public double getSurface(){
        double surface = 0;
        for (Shape shape:shapes) {
            surface += shape.getSurface();
        }
        return surface;
    }

    @Override
    public void move(int x, int y){
        for (Shape shape: shapes) {
            shape.move(x,y);
        }
    }

    public void add(Shape shape){
        shapes.add(shape);
    }
    public void remove(Shape shape){
        shapes.remove(shape);
    }
}
