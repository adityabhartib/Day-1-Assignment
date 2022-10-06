package com.bridgelabz.basics;

import java.util.Scanner;

public class ReverseNumber {
    static void checkreverse(int n) {
        int r;
        while (n > 0) {
            r = n % 10;
            System.out.print(r);
            n=n/10;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scan.nextInt();
        checkreverse(n);
    }
}
