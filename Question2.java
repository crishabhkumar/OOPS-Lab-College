package com.rishabh.Week1;

import java.util.Scanner;

//2.Write a Java program to convert minutes into a number of years and days.
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minutes:");
        int min = input.nextInt();
        int year =  min / 525600;
        int day = min / 1440;

        System.out.println("Year is:" + year);
        System.out.println("Day is:" + day);
    }

}
