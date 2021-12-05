package com.rishabh.Week2;

import java.util.Scanner;

/*
Write a member function for bowler class, which will take two integers as parameter.
Add one integer with runs given and another with wickets, increment no of innings and
calculate other variables accordingly.
 */
public class Bowler {
    int runs,wickets,innings;
    Bowler(){
        runs = 0;
        wickets = 0;
        innings = 0;
    }
    Bowler(int x, int y){
        runs += x;
        wickets += y;
        innings ++;
    }

    void Display(){
        System.out.println("Runs are:" + runs);
        System.out.println("Wickets are:" + wickets);
        System.out.println("Innings are:" + innings);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter run:");
        int run = input.nextInt();
        System.out.print("Enter wickets:");
        int wicket = input.nextInt();

        Bowler b =new Bowler(run,wicket);
        b.Display();

    }


}
