package com.rishabh.Week2;
import java.util.Scanner;
/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class Question6 {
    int avg;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1:");
        int a = input.nextInt();
        System.out.print("Enter num2:");
        int b = input.nextInt();
        System.out.print("Enter num3:");
        int c = input.nextInt();

        Question6 q = new Question6(a,b,c);
        q.Display();
    }

    Question6(int a,int b,int c){
        avg = (a + b + c) / 3;
    }

    void Display(){
        System.out.println("Average of three numbers is:" + avg);
    }

}
