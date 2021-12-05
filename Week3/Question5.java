package com.rishabh.Week3;
/*
2.Create a class to print the area of a square and a rectangle.
The class has two methods with the same name but different number of parameters.
The method for printing area of rectangle has two parameters
which are length and breadth respectively
while the other method for printing area of square has one parameter which is side of square.
 */

class Areaa{
    float area(float l,float b){
        return l*b;
    }

    float area(float l){
        return l*l;
    }

    public static void main(String[] args) {
        Areaa a1 = new Areaa();
        System.out.println("Area of square:" + a1.area(5));
        Areaa a2 = new Areaa();
        System.out.println("Area of rectangle:" + a2.area(6,7));
    }
}

//public class Question5 {
//    public static void main(String[] args) {
//        Areaa a1 = new Areaa();
//        System.out.println("Area of square:" + a1.area(5));
//        Areaa a2 = new Areaa();
//        System.out.println("Area of rectangle:" + a2.area(6,7));
//    }
//}
