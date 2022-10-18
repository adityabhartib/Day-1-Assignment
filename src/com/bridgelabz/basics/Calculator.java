package com.bridgelabz.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2, ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two Number:");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        System.out.println("Select Operation");
        System.out.println("1.Addition \n"+"2.Substraction" + "\n3.Multipliction" + "\n4.Division" + "\n5.exit");
        ch = scan.nextInt();

        if (ch == 1) {
            System.out.println("Addition:" + (n1 + n2));
        } else if (ch == 2) {
            System.out.println("Substraction" + (n1 - n2));
        } else if (ch == 3) {
            System.out.println("Multiplication:" + (n1 * n2));
        } else if (ch == 4) {
            System.out.println("Reminder:" + (n1 / n2));
        } else {
            System.out.println("Exit");

        }
    }
}