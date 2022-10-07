package com.bridgelabz.basics;

import java.util.Scanner;

public class FriendlyPairNumber {
    static void checkFriendlyPair(int num) {
        int sum =0 ;
        for (int i=1;i<num;i++)
        if (num%i==0)
        sum = sum+i;
        int flag=sum;

        if (flag==num) {
            System.out.println("Friendly Pair Number");
        }else {
            System.out.println("Not Friendly Pair Number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();
        checkFriendlyPair(num);
    }
}
