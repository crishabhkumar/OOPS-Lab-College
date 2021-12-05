/*
3. A class has an integer data member 'i' and a method named 'printNum'
to print the value of 'i'. Its subclass also has an integer data member 'j' and a
method named 'printNum' to print the value of 'j'. Make an object of the subclass and
use it to assign a value to 'i' and to 'j'. Now call the method 'printNum' by this object.
 */
package com.rishabh.Week6;

public class Question3 {
    int i;
    void printNum(){
        System.out.println("Value of i:" + i);
    }

    public static void main(String[] args) {
        subClass s = new subClass();
        s.i = 10;
        s.j = 45;
        s.printNum();
    }
}

class subClass extends Question3{
    int j;
    void printNum() {
        System.out.println("Value of j:" + j);
        super.printNum();
        //System.out.println("Value of i:" + super.i);
    }
}