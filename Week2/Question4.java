package com.rishabh.Week2;

import java.util.Scanner;

/*
Write a Java program that takes two numbers as input and display the product of two numbers.
 */
public class Question4 {
    float prod;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1:");
        int a = input.nextInt();
        System.out.print("Enter num2:");
        int b = input.nextInt();
        Question4 q = new Question4(a,b);
        q.Display();
    }

    Question4(int a,int b){
        prod = a*b;
    }
    void Display(){
        System.out.println("Product is:"+prod);
    }
}
