package com.test.homework.collections;

import java.util.HashMap;
import java.util.Map;

public class Solution11 {
    /*
    1. Create collection of HashMap<String, Object>
    2. Put 10 Strings there
    3. Print the map, each pair from new line
    Example:
        Sim - 5
     */
public static void main (String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("banana","grass");
        map.put("cherry","berry");
        map.put("pear","fruit");
        map.put("melon","vegetable");
        map.put("blackberry","berry");
        map.put("ginseng","root");
        map.put("strawberry","berry");
        map.put("toffee","flower");
        map.put("potato","tuber");

        for (Map.Entry<String, Object> pair: map.entrySet()){
                String key = pair.getKey();
                Object value = pair.getValue();
                System.out.println(key+ " - " + value);
        }
}

}