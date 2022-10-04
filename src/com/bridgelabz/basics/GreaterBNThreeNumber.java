package com.bridgelabz.basics;

import java.util.Scanner;

public class GreaterBNThreeNumber {
    static void largerAmonngThree(int num1, int num2, int num3) {
        if ((num1 >= num2) && (num1 >= num3))

            System.out.println(num1 + " is the greater");
        else if (num2 >= num1 && num2 >= num3)

            System.out.println(num2 + " is the greater");
        else
            System.out.println(num3 + " is the greater");
    }

    public static void main(String[] args) {
        largerAmonngThree(10,2,13);
    }
}
