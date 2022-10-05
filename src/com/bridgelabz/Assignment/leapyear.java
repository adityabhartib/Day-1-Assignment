package com.bridgelabz.Assignment;
;
import java.util.Scanner;

public class leapyear {
    static void checkLeapyear(int year) {
        if (year % 400 == 0)
            System.out.println(year + " is a Leap Year");

        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println(year + " is a Leap Year");

        else
            System.out.println(year + " is not a Leap Year");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year=scan.nextInt();
        checkLeapyear(year);
    }
}
