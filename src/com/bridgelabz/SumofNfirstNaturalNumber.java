package com.bridgelabz;

import java.util.Scanner;

public class SumofNfirstNaturalNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++)
//            sum += i;
        System.out.println (num*(num+1)/2);
    }
}
