package FactoryMethod;

public class ConcreteEngine implements Engine {

    @Override
    public int getNumberofPistons() {
        return 4;
    }

    @Override
    public int getSize() {
        return 15;
    }

    @Override
    public int getFeulConsumption() {
        return 30;
    }
}
