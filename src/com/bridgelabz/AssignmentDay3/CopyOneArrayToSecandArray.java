package com.bridgelabz.AssignmentDay3;

import java.util.Scanner;

public class CopyOneArrayToSecandArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Arrays Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
            System.out.println("First Array: ");
            for (int i= 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("\nSecand Array:");
            for (int i = 0; i < b.length; i++) {
                b[i] = a[i];

                System.out.print(b[i] + " ");
            }
        }
    }
