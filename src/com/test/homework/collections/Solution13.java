package com.test.homework.collections;

import java.util.*;


public class Solution13 {
    /*
    1. Create Map<String, String>
    2. Put there 10 elements (key-Surname, value-Name)
    3. Remove people who have the same names
    4. Print the result, each element from new line
     */

    public static void main(String[] args) {
        HashMap<String, String> result = new HashMap<>();
        result.put("Kovalenko", "Vlad");
        result.put("Hordienko", "Oleg");
        result.put("Protsenko", "Oleg");
        result.put("Ihnatenko", "Svyatoslav");
        result.put("Protsyk", "Roman");
        result.put("Radelytska", "Lyubov");
        result.put("Lypyn", "Olha");
        result.put("Huk", "Stepan");
        result.put("Kobilhyk", "Roman");
        result.put("Koval", "Ihor");

        removeTheFirstNameDuplicates(result);
        for (Map.Entry<String, String> element : result.entrySet()) {
            String key = element.getKey();
            String value = element.getValue();
            System.out.println(key + " " + value);
        }
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> element : copy.entrySet()) {
            int count = 0;
            for (Map.Entry<String, String> copyElement : copy.entrySet()) {
                if (element.getValue().equals(copyElement.getValue())) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, element.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}