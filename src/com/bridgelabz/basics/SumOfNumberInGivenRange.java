package com.bridgelabz.basics;

import java.util.Scanner;

public class SumOfNumberInGivenRange {
    public static void main(String[] args) {
        int sum =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Secand Number: ");
        int num2 =scan.nextInt();
//        for (int i = num1; i <= num2; i++)
//            sum = sum + i;
//        System.out.println ("The sum is " + sum);
        System.out.println((num2*(num2+1)/2)-(num1*(num1+1)/2)+num1);
    }
}
