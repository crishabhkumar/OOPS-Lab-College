package com.rishabh.Week2;
/*
Write a Java program to print the sum of two numbers.
 */
public class Question2 {
    int sum;
    public static void main(String[] args) {
        Question2 q = new Question2();
        q.Display();
    }
    Question2(){
        int a = 5;
        int b = 6;
        sum = a + b;
    }

    void Display(){
        System.out.println("Sum is: " + sum);
    }




}
