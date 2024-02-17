package craetional.abstractFactory.v1;

import craetional.abstractFactory.v1.AbstractFactory;
import craetional.abstractFactory.v1.AbstractProductA;
import craetional.abstractFactory.v1.ConcreteFactory1;
import craetional.abstractFactory.v1.ConcreteFactory2;

public class Client {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        System.out.println("class=" + productA.getClass().getSimpleName());

        abstractFactory = new ConcreteFactory2();
        productA = abstractFactory.createProductA();
        System.out.println("class=" + productA.getClass().getSimpleName());
    }
}
