package com.bridgelabz.basics;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();
        int count=1;
//        boolean isprime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
//                    isprime = false;
                    count++;
//                    break;
                }
            }
            if (count==1) {
                System.out.println("prime Number");
            }else {
                System.out.println("Not Prime Number");
        }
    }
}