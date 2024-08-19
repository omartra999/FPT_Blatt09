package AbstractFactory;

public class ConcreateEngine01 implements Engine {

    private int numberOfPistons;
    private int size;
    private int fuelConsumption;

    public ConcreateEngine01(int numberOfPistons, int size, int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
        this.numberOfPistons = numberOfPistons;
        this.size = size;
    }

    @Override
    public int getNumberOfPistons() {
        return numberOfPistons;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "ConcreateEngine01{" +
                "numberOfPistons=" + numberOfPistons +
                ", size=" + size +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
