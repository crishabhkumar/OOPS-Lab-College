/*
Create a class that represents employee.
Calculate the amount paid to a given employee for a pay period
and also calculate overtime pay.
Make an 'OvertimeCalculator' class that can report general information about overtime pay.
 */
package com.rishabh.Week4;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        double grossSalary,incomeTax,professionalTax,providentFund,netSalary,workingTime;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Gross salary:");
        grossSalary=input.nextDouble();
        System.out.print("Enter the Income Tax(in %):");
        incomeTax=input.nextDouble();
        System.out.print("Enter the Professional Tax(in %):");
        professionalTax=input.nextDouble();
        System.out.print("Enter the Provident Fund(in %):");
        providentFund=input.nextDouble();
        System.out.print("Enter the time employee worked(in hrs.):");
        workingTime=input.nextDouble();
        netSalary=salary(grossSalary,providentFund,professionalTax,incomeTax);
        System.out.println("Net Salary is:"+netSalary);
        OvertimeCalculator.overtime(workingTime);
    }
    static double salary(double gs,double pf,double pt,double it)
    {
        pf=pf*(gs/100);
        it=it*(gs/100);
        pt=pt*(gs/100);
        double n=gs-it-pt-pf;
        return n;
    }

}

class OvertimeCalculator{
    static void overtime(double workingTime){
        double overTime,overTimePay;
        if(workingTime > 40){
            overTime = workingTime - 40;
            overTimePay = 12 * overTime;
            System.out.println("Overtime pay is:" + overTimePay);
        }
    }
}



//    double grossSalary,incomeTax,professionalTax,providentFund,extraTime,netSalary;
//    Scanner input = new Scanner(System.in);
//    void input(){
//        System.out.print("Enter the Gross salary:");
//        this.grossSalary = input.nextDouble();
//        System.out.print("Enter Income tax(%):");
//        this.incomeTax = input.nextDouble();
//        System.out.print("Enter the Professional tax(%):");
//        this.professionalTax = input.nextDouble();
//        System.out.print("Enter the Provident fund(%):");
//        this.providentFund = input.nextDouble();
//        System.out.print("Enter the extra time employee worked (in hrs.):");
//        this.extraTime = input.nextDouble();
//    }
//
//    void salaryCalculate(){
//        double gs = (this.grossSalary/100);
//        this.netSalary = grossSalary - (incomeTax * gs) - (professionalTax * gs) - (providentFund * gs);
//    }
//
//    void display(){
//        System.out.println("Net salary is:" + this.netSalary);
//        OvertimeCalculator.overtime(this.extraTime);
//    }
//
//    public static void main(String[] args) {
//        Employee e = new Employee();
//        //for now taking for only one employee
//        e.input();
//        e.salaryCalculate();
//        e.display();
//    }
//
//}

