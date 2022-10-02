package com.bridgelabz.basics;

import java.util.Scanner;

class ArmtrongNumberInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range : ");
        int low = sc.nextInt();
        System.out.println("Enter upper range :");
        int high = sc.nextInt();
        System.out.println("sumstrong numbers between " + low + " and " + high + " are : ");
        int sum, num, x,arm;
        // loop for finding and printing all Armstrong numbers between given range
        for (int i = low; i <= high; i++) {
            sum = 0;
            num = i;
            arm=num;
            while (num > 0) {
                x = num % 10;
                num = num / 10;
                sum = (x * x * x) + sum;
            }
            if (sum == arm) {
                System.out.print(arm+" ");
            }
        }
    }
}