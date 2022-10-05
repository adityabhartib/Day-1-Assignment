package com.bridgelabz.basics;

import java.util.Scanner;

public class ArmstrongNumber {
    static void CheckArmstrongNumber(int n) {
        int arm = 0, rem, c;
        c = n;
        while (n > 0) {
            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }
        if (c == arm)
            System.out.println(" Armstrong Number");
        else
            System.out.println(" Not Armstrong Number");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scan.nextInt();
        CheckArmstrongNumber(n);
    }
}
