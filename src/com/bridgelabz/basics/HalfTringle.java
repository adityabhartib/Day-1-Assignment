package com.bridgelabz.basics;

public class HalfTringle {
    public static void main(String[] args) {
        int i,j;
        for ( i = 1; i <= 5; i++) { //row
            for ( j = 1; j <= i; j++) {//colom
                int sum = i + j;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}