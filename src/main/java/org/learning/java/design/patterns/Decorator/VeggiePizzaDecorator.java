package org.learning.java.design.patterns.Decorator;

public class VeggiePizzaDecorator extends PizzaDecorater{

    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        System.out.println("Adding Veggie Toppings");
    }
}
