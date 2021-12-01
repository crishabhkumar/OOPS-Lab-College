package com.rishabh.Week1;
import java.util.Scanner;
//3.Write a member function for batsman class, which will take one integer as parameter.
// Add this integer with total run, increment no of innings and calculate other variables accordingly.
public class Batsman {
    public static void main(String[] args) {
        //Let initial total run is 0
        //and initialized innings are 5
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the innings:");
        int innings = input.nextInt();
        int totalInnings = innings + 5;
        System.out.println("Player has total runs:" + getTotalRun(0,innings) + " and total innings were:"+ totalInnings);
    }
    static int inputInteger(){                 //function for batsman class, which will take one integer as parameter.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer(Run):");
        int xInt = input.nextInt();
        return xInt;
    }
    static int getTotalRun(int totalRun,int innings){
        for (int i = 0; i < innings; i++) {
            totalRun = totalRun + inputInteger();
        }
        return totalRun;
    }
}


