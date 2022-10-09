package com.bridgelabz.AssignmentDay3;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Printed Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
