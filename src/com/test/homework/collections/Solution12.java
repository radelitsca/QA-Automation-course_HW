package com.test.homework.collections;


import java.util.HashSet;

import java.util.Set;

public class Solution12 {
    /*
    1. Create Set<Integer>
    2. Add there 20 different numbers
    3. Remove from the set all the numbers bigger than 10
     */

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add(i);
        }

        set.removeIf(element -> element > 10);

        for (Integer item : set) {
            System.out.println(item);
        }
    }
}