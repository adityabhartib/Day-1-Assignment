package com.bridgelabz.basics;

import java.util.Scanner;

public class AutomorphicNumber {
    static void checkAutomorphicNumber(int number){
        int result = number * number;
        int remainder = result % 10;
        if (remainder == number)
            System.out.print("Automorphic");
        else
            System.out.print("Not Automorphic");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        checkAutomorphicNumber(number);
    }
}

