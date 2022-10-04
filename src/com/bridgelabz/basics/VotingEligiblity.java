package com.bridgelabz.basics;

import java.util.Scanner;

public class VotingEligiblity {
    public static void main(String[] args) {
        System.out.print("Enter Age : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n>=18) {
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote");
        }
    }
}
