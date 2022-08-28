
package com.test.homework.for_loop;

import java.util.Scanner;

public class PrintRectangle {
    /*
    Read 2 numbers from console (m & n)
    using for loop
    print to console a rectangle size m * n from 8 numbers
    Example:
    m=2, n=4
    8888
    8888
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        PrintRectangle(m,n);

    }
    private static void PrintRectangle(int a, int b) {
      for (int j = 1; j<=a; j++){
        for (int i = 1; i<=b; i++) {
            System.out.print(8);
        }
        System.out.println();
      }
    }
}