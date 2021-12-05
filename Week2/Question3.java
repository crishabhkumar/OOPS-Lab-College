package com.rishabh.Week2;
/*
Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
 */
public class Question3 {
    int a,b,c,d;
    public static void main(String[] args) {
        Question3 q = new Question3();
        q.Display();
    }

    Question3(){
        a = -5 + 8 * 6;
        b = (55+9) % 9;
        c = 20 + (-3 * 5) / 8;
        d = 5 + 15 / 3 * 2 - 8 % 3;
    }
    void Display(){
        System.out.println("Value of a is:" + a);
        System.out.println("Value of b is:" + b);
        System.out.println("Value of c is:" + c);
        System.out.println("Value of d is:" + d);
    }

}
