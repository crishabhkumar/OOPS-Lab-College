package com.rishabh.Week7;
/*Create a class with an inner class that has a
non default constructor (one that takes
arguments).
Create a second class with an inner class that inherits
from the first inner class.*/

public class Question4 {
    public static void main(String[] args) {
        InheritedOuter o = new InheritedOuter();
        o.display();
    }
}

class OuterClass2{
    class InnerClass2{
        InnerClass2(String name){
            System.out.println("My name is:" + name);
        }
    }
}
class InheritedOuter extends OuterClass2{
    InnerClass2 i = new InnerClass2("Rishabh");
    void display(){
        System.out.println("I live in Kolkata.");
    }
}
