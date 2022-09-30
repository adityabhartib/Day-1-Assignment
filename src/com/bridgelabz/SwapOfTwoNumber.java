package com.bridgelabz;

import java.util.Scanner;

public class SwapOfTwoNumber {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        x = sc.nextInt();
        System.out.print("Enter second Number: ");
        y = sc.nextInt();
        System.out.println("Before Swapping\nx = " + x + "\ny = " + y);
        swap(x, y);
    }

    public static void swap(int a, int b) {
//swapping logic
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping\nx = " + a + "\ny = " + b);
    }
}
