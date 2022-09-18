package com.test.homework.generics;

public class Solution {
    /*
    1. Create generic class Storage with 2 methods
    2. With in this class, create collection
    3. Create method put which saves object of any type to this collection
    4. Create method get which returns the latest added object from the collection and removes it from there
     */

    public static void main(String[] args) {
        Storage<String> cat = new Storage<>();

        cat.put("5");
        cat.put("dsa");
        cat.put("dfghdfsfd");

        String last = cat.get();

        System.out.println(last);

    }
}