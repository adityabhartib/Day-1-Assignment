package com.bridgelabz.basics;

import java.util.Scanner;

public class GreatestBNTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Secand Number: ");
        int num2 = scan.nextInt();
        if (num2 == num1)
            System.out.println("Both are Equal");
        else if (num2 > num1)
            System.out.println(num2 + " is greater");
        else
            System.out.println(num1 + " is greater");
    }
}
