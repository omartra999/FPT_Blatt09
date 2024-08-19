package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        MercidesFactory factory= new MercidesFactory();

        System.out.println(factory.order(Color.BLACK, Color.GRAY));
}
}
