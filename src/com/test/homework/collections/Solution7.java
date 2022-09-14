package com.test.homework.collections;

import java.util.HashMap;
import java.util.Map;

public class Solution7 {
    /*
    1. Create collection HashMap<String, String>
    2. Put there 10 pairs:
        banana - grass,
        cherry - berry,
        pear - fruit,
        melon - vegetable,
        blackberry - berry,
        ginseng - root,
        strawberry - berry,
        toffee - flower,
        potato - tuber
     3. Print all the collection to the console, each element from the new line
     Example:
        banana - grass
     */
    public static void main (String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("banana", "grass");
        map.put("cherry", "berry");
        map.put("pear", "fruit");
        map.put("melon", "vegetable");
        map.put("blackberry", "berry");
        map.put("ginseng", "root");
        map.put("strawberry", "berry");
        map.put("toffee", "flower");
        map.put("potato", "tuber");

        for (Map.Entry<String,String> pair: map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}