package org.learning.java.design.patterns.singleton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance.getName());

        instance.setName("Vijay");
        System.out.println(instance.getName());
    }
}
