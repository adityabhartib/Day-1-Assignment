package com.bridgelabz.basics;

import java.util.Scanner;

public class FibonacciSeriesNthTerm {
    public static void main(String[] args) {
        int term, a = 0, b = 1, c;
        System.out.println("Enter term:");
        Scanner sacn = new Scanner(System.in);
        term = sacn.nextInt();
        for (int i = 1; i <= term; i++) {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}