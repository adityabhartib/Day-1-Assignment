package com.bridgelabz.basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int  arm = 0, rem, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scan.nextInt();
        c = n;
        while (n > 0) {
            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }
        if (c == arm)
            System.out.println(n + " Armstrong Number");
        else
            System.out.println(n + " Not Armstrong Number");
    }
}