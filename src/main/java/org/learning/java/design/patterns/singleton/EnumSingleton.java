package org.learning.java.design.patterns.singleton;

/***
 * To Avoid Reflection Problem we are using the ENUM instance
 * As there is no constructor or anything in this ENUM class
 */
public enum EnumSingleton {
    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
