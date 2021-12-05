/*
1.Create a class 'Student' with data members which are name and marks of five subjects.
You need to find out the topper based on the total marks obtained by the students(at le
ast 10 students) using static concept(block,variable,method).
 */

package com.rishabh.Week4;
import java.util.Scanner;
public class Student {
    static int totalHighestMarks = Integer.MIN_VALUE;    //for comparison purpose only
    static String topperName = "null";               //name string
    static void count(int[] array,String name){
        int sum =0;
        for(int num:array){
            sum += num;
        }
        Student.compare(sum,name);
    }
    static void compare(int x,String name){
        if(x > totalHighestMarks){
            totalHighestMarks = x;
            topperName =name;
        }
    }
    static void display(){
        System.out.println("Topper is: " + topperName.toUpperCase() + " and Score is: " + totalHighestMarks);
    }

    public static void main(String[] args) {
        System.out.println("Currently for 3 Students with 5 Subjects");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int studentCounter = 3;
        while (studentCounter != 0) {
            int[] arr = new int[5];
            System.out.print("Enter the name of the Student : ");
            String stuName;     //student name
            stuName=input.nextLine();
            System.out.print("Enter the marks of five subjects (continuously with space): ");
            for (int i = 0; i < 5; i++) {
                arr[i] = input.nextInt();
            }
            input.nextLine();
            Student.count(arr,stuName);
            studentCounter--;
        }
        Student.display();
    }
}

//
//public class StudentMarks {
//    public static void main(String[] args) {
//        System.out.println("Representing 3 Cases with 3
//                Subjects");
//                System.out.println("------------------------------------
//                        ");
//                        Scanner input = new Scanner(System.in);
//        int t = 3;
//        while (t-->0) {
//            int[] arr = new int[3];
//            System.out.print("Enter the name of the Student : ");
//            String naam;
//            input.nextLine();
//            naam=input.nextLine();
//            System.out.print("Enter the five numbers of subject
//                    in 'PCMBC' manner : ");
//            for (int i = 0; i < 3; i++) {
//                arr[i] = input.nextInt();
//            }
//            Student.count(arr,naam);
//        }
//        Student.display();
//    }
//}

////    //initializing static variable
////    static int temp = Integer.MIN_VALUE;
////    static String k = "null";
////
////    //counting total marks of each student
////    static void count(int[] array, String name) {
////        int sum = 0;
////        for (int num : array) {
////            sum += num;
////        }
////        Student.compare(sum, name);
////    }
////
////    static void compare(int x, String name) {
////        if (x > temp) {
////            temp = x;
////            k = name;
////        }
////    }
////
////    static void display() {
////        System.out.println("Highest marks is:" + temp + " and scored by " + k);
////    }
////
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////
////    }
//}

//class StudentMarks{
//
//}






//    String name;
//    int[] marks = new int[5];   //marks array for five subjects
//    int marks_sum = 0;
//    void display(){
//        System.out.println(this.name);
//        System.out.println("Marks are:");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(this.marks[i]);
//        }
//    }
//    public static void main(String[] args) {
//        Student[] s = new Student[10];
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the numbers for subjects:");
//        for (int i = 0; i < 10; i++) {
//            s[i] = new Student();
//            System.out.println("Enter the name:");
//            s[i].name = input.next();
//            System.out.println("Enter the five subjects marks:");
//            for (int j = 0; j < 5; j++) {
//                s[i].marks[j] = input.nextInt();
//            }
//            input.nextLine();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//                s[i].marks_sum += s[i].marks[i];
//            }
//        }
//
//
//        for (int i = 0; i < 10; i++) {
//
//        }
//
//    }
//}
