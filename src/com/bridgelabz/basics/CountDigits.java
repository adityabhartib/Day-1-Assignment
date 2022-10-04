package com.bridgelabz.basics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.print("Enter Any Number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of Digits: "+count);
    }
}
