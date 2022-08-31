package com.test.homework.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {
    /*
    1. Create an Array of Strings, size 10
    2. Create an Array of int, size 10
    3. Read from the console and fill in the Array with Strings
    4. Fill in the int Array with length of Strings from the first Array.
        If the first element contains "Hello", we put in the first element of int Array - 5
    5. Print the int Array to the console
     */
    public static void main(String[] args) {
        String[] words = new String[10];
        int[] nums = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 words:");

        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();
        }

        for (int j = 0; j < words.length; j++) {
            nums[j] = words[j].length();
        }

        System.out.println(Arrays.toString(nums));
    }
}