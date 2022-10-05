package com.bridgelabz.basics;

import java.util.Scanner;
public class ArmtrongNumberInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range : ");
        int low = sc.nextInt();
        System.out.println("Enter upper range :");
        int high = sc.nextInt();
        System.out.println("sumstrong numbers between " + low + " and " + high + " are : ");
    }
}