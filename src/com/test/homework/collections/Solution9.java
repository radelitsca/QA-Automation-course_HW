package com.test.homework.collections;

import java.util.HashMap;
import java.util.Map;

public class Solution9 {
    /*
    1. Create collection of HashMap<String, String>
    2. Put 10 Strings there
    3. Print the list of Keys, each key from the new line
     */

    public static void main(String[] args) {
        String[] values = new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};
        String[] keys = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        Map<String, String> result = addElementsToMap(keys, values);


        for (Map.Entry<String, String> pair : result.entrySet()) {
            System.out.println(pair.getKey());
        }

    }

    public static HashMap<String, String> addElementsToMap(String[] nums, String[] strings) {
        HashMap<String, String> map = new HashMap<>();
        for (int a = 0; a < strings.length; a++) {
            map.put(nums[a], strings[a]);
        }
        return map;

    }
}
