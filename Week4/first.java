package com.rishabh.Week4;
/*
Write java program with
static block and check
whether static block is executed before constructor or after constructor.
 */
public class first {
    static {
        System.out.println("Hello");
    }
    first(){
        System.out.println("Construtor");
    }
    public static void main(String[] args) {
        first q = new first();
        second s = new second();
    }
}
class second {
    second(){
        System.out.println("Second Constructor");
    }
    static {
        System.out.println("Hiii");
    }
}
