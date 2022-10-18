package com.bridgelabz.Assignment;

import java.util.Scanner;

public class TwoStringEqualOrNot {
    static void StringCheck(String s1,String s2){
        if (s1.equals(s2)) {
            System.out.println("Sting Are Equal");
        } else {
            System.out.println("String Are Not Equal");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input First String: ");
        String s1 = scan.nextLine();
        System.out.println("Input Second String: ");
        String s2 = scan.nextLine();
        StringCheck(s1,s2);

    }
}
