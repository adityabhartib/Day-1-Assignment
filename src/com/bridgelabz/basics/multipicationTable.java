package com.bridgelabz.basics;

import java.util.Scanner;

public class multipicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int num = scan.nextInt();
        for (int i=1;i<=10;i++){

            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
