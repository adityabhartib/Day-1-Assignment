package com.bridgelabz.basics;

import java.util.Scanner;

public class SumofDigitOfNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num =scan.nextInt();
                int sum = 0;
        //loop to find sum of digits
        while(num!=0){
            sum += num % 10;
            num = num / 10;
        }
        //output
        System.out.println ("Sum of digits : " + sum);
    }
}
