package com.test.homework.collections;

import java.util.HashSet;
import java.util.Set;

public class Solution6 {

    /*
        1. Create collection HashSet with type <String>
        2. Put 10 strings (banana, cherry, pear, melon, blackberry, ginseng, strawberry, toffee, potato)
        3. Print to the console this collection, each element from new line
        4. Pay attention to the order changed order of the strings
         */
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("melon");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("toffee");
        set.add("potato");

        for (String s : set) {
            System.out.println(s);
        }
    }

}