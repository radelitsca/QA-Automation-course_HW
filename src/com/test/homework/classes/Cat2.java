package com.test.homework.classes;

public class Cat2 {

    private static int catsCount = 0;

    public static void main(String[] args) {
        addNewCat();
        System.out.println(catsCount);
    }

    public static void addNewCat() {
        //implement this method that the quantity of cats are incremented
        catsCount++;
    }

}