package com.rishabh.Week3;
/*
2.Create a class named 'Rectangle' with two data members- length and breadth and a method to
calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
 */

class Rectangle{
    float length,breadth,area;
    Rectangle(){
        this.length = this.breadth = 0;
    }
    Rectangle(float x,float y){
        this.length = x;
        this.breadth = y;
    }

    Rectangle(float x){
        this.length = this.breadth = x;
    }

     float area(){
        this.area = this.length * this.breadth;
        return area;
    }

}

public class Question2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4f,5f);
        Rectangle r3 = new Rectangle(5f);
        System.out.println("Area of Rectangle 1:" + r1.area());
        System.out.println("Area of Rectangle 2:" + r2.area());
        System.out.println("Area of Rectangle 3:" + r3.area());


    }
}
