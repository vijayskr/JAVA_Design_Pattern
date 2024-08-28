package org.learning.java.design.patterns.Decorator;

public class PizzaDecorater implements Pizza{
    private Pizza pizza;

    public PizzaDecorater(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        pizza.bake();
    }
}
