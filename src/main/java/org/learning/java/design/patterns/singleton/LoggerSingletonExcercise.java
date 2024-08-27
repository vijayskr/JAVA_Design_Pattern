package org.learning.java.design.patterns.singleton;

public class LoggerSingletonExcercise implements Cloneable{
    private static volatile LoggerSingletonExcercise appLogging;

    private LoggerSingletonExcercise() {

    }

    public static synchronized LoggerSingletonExcercise getInstance() {
        if(appLogging == null) {
            synchronized (LoggerSingletonExcercise.class) {
                if(appLogging == null) {
                    appLogging = new LoggerSingletonExcercise();
                }
            }
        }
        return appLogging;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
