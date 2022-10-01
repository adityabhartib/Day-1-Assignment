package com.bridgelabz.basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();
        if (num % 2==0)
            System.out.println(num +" is Even Number");
        else
            System.out.println(num +" is Odd Number");
    }
}
