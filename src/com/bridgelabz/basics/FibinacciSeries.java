package com.bridgelabz.basics;

import java.util.Scanner;

public class FibinacciSeries {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num =scan.nextInt();
        int a = 0, b = 1;

        // 0th and 1st terms
        System.out.print (a + " , " + b + " , ");

        int nextTerm;

        // printing the rest of the terms here
        for (int i = 2; i <= num; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }
}
