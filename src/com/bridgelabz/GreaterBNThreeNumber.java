package com.bridgelabz;

import java.util.Scanner;

public class GreaterBNThreeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Secand Number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 =scan.nextInt();
        //comparing num1 with other numbers
        if ((num1 >= num2) && (num1 >= num3))
            System.out.println (num1 + " is the greatest");

            //checking if num2 is greatest
        else if (num2 >= num1 && num2 >= num3)
            System.out.println (num2 + " is the greatest");

            // num3 has to be greatest then if not above
        else
            System.out.println (num3 + " is the greatest");
    }
}
