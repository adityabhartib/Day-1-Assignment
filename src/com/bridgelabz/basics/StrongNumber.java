package com.bridgelabz.basics;

import java.util.Scanner;

public class StrongNumber {
    static void detectStrong(int num) {

        int fact=1;
        int reminder=num%10;
        while (reminder==0)
        for (int i=1;i<=reminder;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        if (fact == num) {
            System.out.println(num + " is Strong Number");
        } else {
            System.out.println(num + " is not a Strong Number");
        }
    }
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=scan.nextInt();
        detectStrong(num);
    }
}