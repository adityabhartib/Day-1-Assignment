package com.bridgelabz;

import java.util.Scanner;

public class sumFirstNaturalNumber {
    public static void main(String[] args) {
        System.out.println("-----Welcome to sum of First Natural Number-------");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int Number =scan.nextInt();
        int Sum = 0;
        for (int i =1; i<=Number; i++)
            Sum=Sum+i;
        System.out.println("First N Natural Number Sum is :"+Sum);

    }
}
