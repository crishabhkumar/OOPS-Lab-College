package com.rishabh.Week3;
/*
1.Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it.
Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50.
Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank.
 */
class AddAmount {
    int amount;
    AddAmount(){
        amount = 50;
    }
    AddAmount(int x){
        this();
        amount += x;
    }
    void display(){
        System.out.println("Final amount of piggie is:" + amount);
    }
}

public class Question1{
    public static void main(String[] args) {
        AddAmount a = new AddAmount();
        AddAmount a1 = new AddAmount(40);
        a.display();
        a1.display();
    }
}
