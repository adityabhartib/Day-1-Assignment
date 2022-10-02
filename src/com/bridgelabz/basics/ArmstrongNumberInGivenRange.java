package com.bridgelabz.basics;

import java.util.Scanner;

public class ArmstrongNumberInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range : ");
        int low = sc.nextInt();
        System.out.println("Enter upper range :");
        int high = sc.nextInt();
        System.out.println("Armstrong numbers between "+ low + " and " + high + " are : ");
        int rem=0,arm=0;
        // loop for finding and printing all armstrong numbers between given range
        for(int num = low ; num <= high ; num++){
            while (num >high)
                rem = num % 10;
                arm = (rem * rem * rem) + arm;
                num = num / 10;
                System.out.println(arm+" ");
            }
        }
    }
