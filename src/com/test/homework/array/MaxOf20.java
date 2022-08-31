package com.test.homework.array;

import java.util.Scanner;

public class MaxOf20 {
    /*
    1. In the method initializeArray():
    1.1. Create an Array - size 20
    1.2. Read numbers from the console and fill in this array
    2. Method max(int[] array) should find max number from elements of an array
     */

    public static void main(String[] args) {
        int[] array = initializeArray();
        int maxNumber = max(array);
        System.out.println(maxNumber);
    }

    private static int[] initializeArray() {
        int[] arrayOf20 = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");

        for (int i = 0; i < arrayOf20.length; i++) {
            arrayOf20[i] = scanner.nextInt();
        }
        return arrayOf20;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
}
