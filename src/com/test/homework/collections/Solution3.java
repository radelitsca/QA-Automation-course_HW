package com.test.homework.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {
    /*
    1. Create List of Strings
    2. Read from the console 5 strings and add them to the List (Scanner class)
    3. Using loop find the shortest string in the List
    4. Print to the console found string
    5. If there are several shortest strings, print each of them.
     */

    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 strings");

        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            list.add(s);
        }
        int minLength=0;
        for (int i = 0; i < list.size() - 1; i++) {
            minLength = list.get(i).length();
            if (list.get(i + 1).length() <= minLength) {
                minLength = list.get(i + 1).length();
            }
        }

        for (String s : list) {
            if (s.length() == minLength) {
                System.out.println(s);
            }
        }
    }
}