package com.test.homework.collections;

import java.util.HashMap;

import java.util.Map;




/**

 * Create Map<String, String>

 * Put there 10 elements (key-Surname, value-Name)

 * Remove people who have the same names

 * Print the result, each element from new line

 */




public class Solution13_1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Amosov", "Nikolai");

        map.put("Bandera", "Stepan");

        map.put("Ukrainka", "Lesya");

        map.put("Franko", "Ivan");

        map.put("Hmelnitsky", "Bohdan");

        map.put("Shevchenko", "Taras");

        map.put("Durak", "Ivan");

        map.put("Mudriy", "Yaroslav");

        map.put("Chernovol", "Vyacheslav");




        Map<String, String> newMap = new HashMap<>();

        for (Map.Entry<String, String> pair : map.entrySet()) {

            newMap.put(pair.getValue(), pair.getKey());

        }

        System.out.println(newMap);

    }

}
