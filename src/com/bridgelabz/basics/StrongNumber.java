package com.bridgelabz.basics;

import java.util.Scanner;

public class StrongNumber {
    static void checkStrong(int num) {
        int fact = 1, rem, sum=0,flag=sum;
        rem = num % 10;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
                num=num/10;
                sum = sum+fact;
        }
        if(flag==num) {
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num =scan.nextInt();
        checkStrong(num);
    }
}
