package com.bridgelabz.basics;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        double m=Math.sqrt(num);
        System.out.println("Square root of " +num+" is "+m);


    }
}
