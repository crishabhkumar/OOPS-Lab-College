package com.rishabh.Week7;
/*
2. Create an inner class with a method that modifies the outer class field and calls the outer class method.
In a second outer class method, create an object of the inner class and call its
method, then show the effect on the outer class object.
 */
public class Question2 {
    public static void main(String[] args) {
        OuterClass1 o = new OuterClass1();
        o.outerDisplay();
        o.innerDisplay();
    }
}

class OuterClass1{
    void show(){
        System.out.println("I am outer class method.");
    }
    class InnerClass1{
        void show(){
            System.out.println("I am inner class method.");
        }
    }
    void innerDisplay(){
        InnerClass1 i = new InnerClass1();
        i.show();
    }
    void outerDisplay(){
        show();
    }
}
