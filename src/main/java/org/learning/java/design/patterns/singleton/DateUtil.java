package org.learning.java.design.patterns.singleton;

import java.io.Serializable;

//public class DateUtil {
public class DateUtil implements Serializable, Cloneable {
    /**
     * EAGER initialization
     */
    //private static DateUtil dateUtilInstance = new DateUtil();

    //    private static DateUtil dateUtilInstance;

    //To Avoid any issues in the Multi thread operation we mark this static variable as VOLATILE as well including to synchronize
    private static volatile DateUtil dateUtilInstance;

    //EAGER Initialization, should be used only when we are sure
    // that the object instance will be used in the program at least once for sure.

    /**
     * STATIC Block
     */
    //    static {
    //        dateUtilInstance = new DateUtil();
    //    }

    private DateUtil() {

    }

    //LAZY Initialization, this is normal and commonly used method
//    public static DateUtil getInstance() {
//        if(dateUtilInstance == null) {
//            dateUtilInstance = new DateUtil();
//        }
//        return dateUtilInstance;
//    }

    //Singleton thread safe code
    //Allows only one thread is being called in this segment
//    public static synchronized DateUtil getInstance() {
//        if(dateUtilInstance == null) {
//            dateUtilInstance = new DateUtil();
//        }
//        return dateUtilInstance;
//    }

    //Thread safe code block
//    public static synchronized DateUtil getInstance() {
//        synchronized (DateUtil.class) { //Expensive process
//            if (dateUtilInstance == null) {
//                dateUtilInstance = new DateUtil();
//            }
//        }
//        return dateUtilInstance;
//    }

    /***
     * To make only the lock when it is needed
     * @return
     */
    public static synchronized DateUtil getInstance() {
        if (dateUtilInstance == null) {
            synchronized (DateUtil.class) { //Expensive process
                if (dateUtilInstance == null) {
                    dateUtilInstance = new DateUtil();
                }
            }
        }
        return dateUtilInstance;
    }

    //This method will be automatically invoked by the OIS stream after reading the file which will help
    // in resolving teh serialization issue while focusing on the singleton pattern
    // private or protected would work, just to restrict it from overriding in child classes
    protected Object readResolve() {
        return dateUtilInstance;
    }

    //If any of the child class uses this DateUtil and tries to implement the clone method to call
    // the super.clone() - this will break the Singleton pattern. To avoid this we need to block and
    // thorw the exception so that the original object can be used on all instances.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
