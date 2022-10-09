package com.bridgelabz.AssignmentDay3;

import java.util.Scanner;

public class SumofArrayElement {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Print Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum = a[i] + sum;
        }
        System.out.println("\nAddition of Array Elemene: " + sum);
    }
}
