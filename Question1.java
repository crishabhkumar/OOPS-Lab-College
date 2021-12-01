package com.rishabh.Week1;

import java.util.Scanner;

//1. Write a Java program to convert temperature from Fahrenheit to Celsius degree
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature value (in F):");
        float tempF = input.nextFloat();
        float tempC = (tempF - 32) * 5/9;
        System.out.println("Temperature in C is :" + tempC);

    }
}
