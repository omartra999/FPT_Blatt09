package FactoryMethod;


public abstract class CarFactory{

    public CarFactory(){}

    public Car order(Color color, Color seatColor){
       Car car= build(color,seatColor);
       car.testDrive();
       return car;
    }
    public abstract Car build(Color color,Color seatColor);

}
