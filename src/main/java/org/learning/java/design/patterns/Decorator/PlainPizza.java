package org.learning.java.design.patterns.Decorator;

public class PlainPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking Plain Pizza");
    }
}
