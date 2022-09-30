package com.bridgelabz;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 0, power = 0, result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value: ");
        base = sc.nextInt();
        System.out.println("Enter power value: ");
        power = sc.nextInt();

        for(int i = 1; i <= power; i++) {
            result = result * base;
        }

        System.out.println( "Number  is: " + result);
    }
}
