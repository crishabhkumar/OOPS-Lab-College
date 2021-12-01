package com.rishabh.Week1;
/*
// Write a member function for bowler class, which will take two integers as parameter.
// Add one integer with runs given and another with wickets, increment no of innings and calculate other variables accordingly.
 */
import java.util.Scanner;

public class Bowler {
    public static void main(String[] args) {
        //Let player has already runs = 50
        //and wickets = 5
        //and let the initialized innings are 4
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the innings:");
        int innings = input.nextInt();
        int totalInnings = innings + 4;
        System.out.println("Player has total runs :" + getTotalRunBowler(50,innings) + " and " +
                "wickets are:" + totalWickets(5,innings) + " with total innings: " + totalInnings);
    }
    static int totalWickets(int wicket,int innings){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < innings; i++) {
            System.out.print("Enter integer(wicket):");
            int num1 = input.nextInt();
            wicket = wicket + num1;
        }
        return wicket;
    }
    static int getTotalRunBowler(int totalRun,int innings){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < innings; i++) {
            System.out.print("Enter integer(run):");
            int num2 = input.nextInt();
            totalRun = totalRun + num2;
        }
        return totalRun;
    }

}
