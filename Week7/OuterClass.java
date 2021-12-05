package com.rishabh.Week7;
/*
Show that an inner class has access to the private elements of its outer class.
Determine whether the reverse is true
 */
public class OuterClass {
    private int i = 10;
    class InnerClass{
        void display(){
            System.out.println("The value of private i is:" + i);
        }
    }
    void show(){
        InnerClass i = new InnerClass();
        i.display();
    }
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        o.show();
    }
}
