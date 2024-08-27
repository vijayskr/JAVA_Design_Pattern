package org.learning.java.design.patterns.singleton;

import java.io.*;

public class TestDateUtil {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //DateUtil dateUtil = new DateUtil();

        DateUtil dateUtil = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/vijayasankar/Documents/Spring_Boot_Learning/CorePatterns/src/main/resources/testObje.ser")));
        oos.writeObject(dateUtil);

        DateUtil dateUtil2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/vijayasankar/Documents/Spring_Boot_Learning/CorePatterns/src/main/resources/testObje.ser")));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(dateUtil == dateUtil2);
    }
}
