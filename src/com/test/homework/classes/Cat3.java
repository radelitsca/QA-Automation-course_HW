
package com.test.homework.classes;

public class Cat3 {
    private static int catsCount = 0;

    public static void main(String[] args) {
        setCatsCount(5);
        System.out.println(catsCount);
    }

    public static void setCatsCount(int catsCount) {
        /*
        implement method that it sets up catsCount to the path parameter of the method
         */
        Cat3.catsCount = catsCount;
    }
}