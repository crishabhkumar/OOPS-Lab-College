package com.rishabh.Week2;

import java.util.Scanner;

/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
 */
public class Question5 {
    int sum,sub,prod,div,rem;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1:");
        int a = input.nextInt();
        System.out.print("Enter num2:");
        int b = input.nextInt();
        Question5 q = new Question5(a,b);
        q.Display();
    }

    Question5(int a,int b){
        sum = a + b;
        sub = a - b;
        prod = a * b;
        div = a / b;
        rem = a % b;
    }
    void Display(){
        System.out.println("Sum is:" + sum);
        System.out.println("Subtraction is:" + sub);
        System.out.println("Multiplication is:" + prod);
        System.out.println("Division is:" + div);
        System.out.println("Remainder is:" + rem);
    }
}
