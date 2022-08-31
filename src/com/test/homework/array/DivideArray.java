package com.test.homework.array;

import java.util.Arrays;
import java.util.Scanner;

public class DivideArray {
    /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */

    public static void main(String[] args) {

        int[] array = new int[20];
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.arraycopy(array, 0, firstArray, 0, firstArray.length);
        System.arraycopy(array, firstArray.length, secondArray, 0, secondArray.length);

        System.out.println(Arrays.toString(secondArray));


    }
}