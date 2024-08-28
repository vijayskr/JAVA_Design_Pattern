package org.learning.java.design.patterns.Decorator;

public class DecoratorTest {

    public static void main(String[] args) {
     Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator((new PlainPizza())));
     pizza.bake();
    }
}
