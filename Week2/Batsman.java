package com.rishabh.Week2;

import java.util.Scanner;

/*
Write a member function for batsman class, which will take one integer as parameter.
Add this integer with total run, increment no of innings and calculate other variables accordingly.

 */
public class Batsman {
    int totalRun,inning,wickets;
    Batsman(){
        totalRun = 50;
        inning = 5;
    }
    Batsman(int x){
        totalRun += x;
        inning++;
    }

    void Display(){
        System.out.println("Total run is:" + totalRun);
        System.out.println("Innings are:" + inning);
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the run:");
        int run = input.nextInt();
        Batsman b = new Batsman();
        Batsman b1 = new Batsman(run);
        System.out.println("Object 1:");
        b.Display();
        System.out.println("Object 2:");
        b1.Display();
    }


}
