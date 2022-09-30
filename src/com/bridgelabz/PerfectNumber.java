package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scan.nextInt();


        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
                sum = sum + i;
        }

        if (sum == n)
            System.out.println (n + " Is a perfect number");
        else
            System.out.println (n + " Is not a perfect number");

    }
}
