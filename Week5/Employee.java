package com.rishabh.Week5;

public class Employee {
    String name;
    int age;
    String address;
    public static void main(String[] args){
        Manager m = new Manager();
        m.display("IT","Kolkata","Priyanshu");
        Worker w = new Worker();
        w.salary(15,100);
    }
}

class Manager extends Employee{
    String department;
    float salary;
    void display(String department, String address,String name){
        System.out.println("The name of the dept of the manager is:" + department);
        System.out.println("The address of the manager is:" + address);
        System.out.println("The name of the manager is:" + name);
    }

}

class Worker extends Employee{
    int numberOfDaysWorked;
    float dailyWages;
    float totalSalary;
    void salary(int wage, int days){
        System.out.println("The total salary of each employee is:" + wage * days);
    }
}

