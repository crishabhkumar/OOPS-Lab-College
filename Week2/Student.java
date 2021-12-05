package com.rishabh.Week2;
import java.util.Scanner;
/*
Create a class 'Student' with three data members which are name, age and address.
The constructor of the class assigns default values name as "unknown", age as '0' and
address as "not available". It has two members with the same name 'setInfo'.
First method has two parameters for name and age and assigns the same whereas the second method
takes has three parameters which are assigned to name, age and address respectively.
Print the name, age and address of 10 students.
 */
public class Student {
    String name,address;
    int age;

    Student(){
        name = "unknown";
        age = 0;
        address = "not available";
    }

    void setInfo(String objName,int objAge){
        name = objName;
        age = objAge;
    }

    void setInfo(String objName,int objAge,String objAddress){
        name = objName;
        age = objAge;
        address = objAddress;
    }

    void Display(){
        System.out.println("Student name is:" + name);
        System.out.println("Age is:" + age);
        System.out.println("Address is:" + address);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Student s = new Student();
//        s.setInfo("Rishabh",85,"Kolkata");
//        s.Display();
        Student[] s = new Student[10];
        for (int i = 0; i < 10; i++) {
            s[i] = new Student();
            System.out.print("Enter the name:");
            String name = input.next();
            System.out.print("Enter the age:");
            int age = input.nextInt();
            System.out.print("Enter the address:");
            String add = input.next();
            s[i].setInfo(name,age,add);
            System.out.println();
        }

        //Display
        for (int i = 0; i < 10; i++) {
            s[i].Display();
            System.out.println();
        }
    }

}
