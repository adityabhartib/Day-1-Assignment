package com.bridgelabz.AssignmentDay3;

public class PrintArrayElement {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 4, 5, 7, 8, 9,10, 3};
        System.out.println("Elements of given array : "); //Loop through the array by incrementing value of i

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
