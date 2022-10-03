package com.bridgelabz.basics;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int Num = scan.nextInt();
        int Sum = 0;
        int temp = Num;
        while (temp != 0) {
            int rem = temp % 10;
            Sum += rem;
            temp /= 10;
        }
        if (Num % Sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }

}