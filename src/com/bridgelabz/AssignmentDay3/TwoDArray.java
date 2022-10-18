package com.bridgelabz.AssignmentDay3;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int row = sc.nextInt();
        System.out.println("Enter Collum: ");
        int collum = sc.nextInt();
        int arr[][] = new int[row][collum];

        System.out.println("Enter Arrays Element:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("------------Matrix--------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

