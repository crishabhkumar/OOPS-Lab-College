package com.rishabh.Week7;
/*
3. Create a class containing an inner class that itself contains an inner class.
Repeat this using nested classes.
Note the names of the .class files produced by the compiler
 */
public class Question3 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
class Outer{
    class Inner{
        class nestedInner{
            void display(){
                System.out.println("I am nested inner class.");
            }
        }
    }
    void display(){
        Inner.nestedInner i = new Inner().new nestedInner();
        i.display();
    }
}
