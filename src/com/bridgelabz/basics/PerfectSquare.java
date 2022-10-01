package com.bridgelabz.basics;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Square Number: ");
         int num2= sc.nextInt();
         if (num2 ==num1*num1)
             System.out.println(num2+" is Perfect Square of >"+num1);
         else
             System.out.println(num2+" is Not a Perfect Square of >"+num1);
    }
}
