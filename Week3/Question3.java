package com.rishabh.Week3;
/*
3.Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the name should be "Unknown",
otherwise the name should be equal to the String value passed while creating object of Student class.
 */
class Student{
    String name;
    Student(){
        this.name = "Unknown";
    }
    Student(String n){
        this.name = n;
    }

    void display(){
        System.out.println("Name os student is:" + name);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Student s1 = new Student("Rishabh");
        Student s2 = new Student("Vivek");
        s1.display();
        s2.display();
    }
}
