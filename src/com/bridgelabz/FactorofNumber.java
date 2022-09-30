package com.bridgelabz;

import java.util.Scanner;

public class FactorofNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();

        System.out.println( "Factors of " + num + " are " );

        // finding and printing factors b/w 1 to num
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.println(i + " ");
        }
    }
}