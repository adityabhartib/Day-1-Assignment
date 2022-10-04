package com.bridgelabz.basics;

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        int sal = scan.nextInt();
        double tax;
        if (sal<=10000){
            System.out.println("Salary: "+sal+" Tax: 0");
    } else if (sal>10000 && sal>=100000 ) {
            tax = sal * 0.10;
            System.out.println("salary: "+sal + " Tax: " + tax);
        }else {
            tax=sal*0.20;
            System.out.println("Salary: "+sal+" Tax: "+tax);

        }

        }
    }
