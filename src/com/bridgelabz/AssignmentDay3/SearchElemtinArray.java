package com.bridgelabz.AssignmentDay3;

import javax.swing.*;
import java.util.Scanner;

public class SearchElemtinArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int n, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Print Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nEnter Search Element: ");
        n=sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Item Found"+ " "+count+" Times");
        } else {
            System.out.println("Item Not Found");
        }
    }
}