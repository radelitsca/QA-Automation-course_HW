package com.test.homework.string;

import java.util.Arrays;

public class StringTask {
    public static void main(String[] args) {
        String s = "Hey how are you";

        //print the length of the string
        System.out.println("String length is " + s.length());
        //print the last char of the string (use the previous method to calculate the index - do not use hardcoded indexes)
        System.out.println("The last char of the string is "+(s.charAt(s.length() - 1)));
        //print the index of 'a'
        System.out.println("Index of 'a' is " + s.indexOf('a' ));
        //substirng the string by the second space " " - result should be "Hey how"
        int index1 = s.indexOf(" ");
        int index2 = s.indexOf(" ", index1 + 1);
        System.out.println(s.substring(0, index2));
        //check if the string start with 'h', with 'H', end with '\'
        System.out.println(s.startsWith("h"));
        System.out.println(s.startsWith("H"));
        System.out.println(s.endsWith("/"));
        //check if the string contains "are you" contains "are you "
        System.out.println(s.contains("are you"));
        System.out.println(s.contains("are you "));
        //replace "how" to "who"
        String s2 = s.replace("how", "who");
        System.out.println(s2);
        //split the string via space " " and print each word from the new line
        String[] array = s.split(" ");
        for (String element : array) {
            System.out.println(element);
        }
        //create the method that takes String and char parameters and return the quantity of letters that exist in that string
        int k = getCharQuantityInTheString("Hey how are you", 'e' );
        System.out.println(k);
        //create the greeting method that takes name and age and print the string - "Hey, my name is Andrii, and I'm 41 years old"
        // (Use String.format function)
        greeting("Lyubov", 20);
    }

    public static int getCharQuantityInTheString(String s, char c) {
        int quantity = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                quantity++;
        }
        return quantity;

    }

    public static void greeting(String name, int age) {
        String greeting = String.format("Hey, my name is %s, and I'm %d years old", name, age);
        System.out.println(greeting);
    }
}