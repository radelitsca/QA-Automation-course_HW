package com.test.homework.collections;

import java.util.ArrayList;

public class Solution1 {
    /*
    1. Create List of Strings
    2. Add 5 different strings
    3. Print to the console the size of the List
    4. Using loop, print all the items to the console from the List
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");

        System.out.println(list.size());

        for (String s: list) {
            System.out.println(s);
        }
    }
}