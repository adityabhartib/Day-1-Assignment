package com.bridgelabz.basics;

import java.util.Scanner;

public class ConvertUppertoLower {
    static void convert(char ch){
        char ch2;
        if(ch>='A' && ch<='Z'){
            ch2=Character.toLowerCase(ch);
            System.out.println("LoweerCase: "+ch2);
    }else {
            ch2=Character.toUpperCase(ch);
            System.out.println("UpperCase: "+ch2);
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Any Character: ");
        char ch=scan.next().charAt(0);
        convert(ch);
    }
}
