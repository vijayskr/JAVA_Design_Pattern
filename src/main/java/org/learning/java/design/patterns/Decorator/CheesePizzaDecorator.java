package org.learning.java.design.patterns.Decorator;

public class CheesePizzaDecorator extends PizzaDecorater{

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        System.out.println("Adding Cheese Toppings");
    }
}
