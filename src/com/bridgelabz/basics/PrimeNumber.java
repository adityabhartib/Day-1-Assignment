package com.bridgelabz.basics;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();
        boolean isprime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime==true) {
                System.out.println("prime Number");
            }else {
                System.out.println("Not Prime Number");
        }
    }
}