/*
4. A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A,
Bank B and Bank C respectively. We have to print the money deposited
by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0.
Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank.
Call the method 'getBalance' by the object of each of the three banks.
 */
package com.rishabh.Week6;

public class Bank {
    public int getBalance(){
        return 0;
    }

    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        a.deposit = 1000;
        b.deposit = 1500;
        c.deposit = 2000;
        System.out.println("Money deposited in A:" + a.getBalance());
        System.out.println("Money deposited in B:" + b.getBalance());
        System.out.println("Money deposited in C:" + c.getBalance());

    }
}

class BankA extends Bank{
    int deposit;
    public int getBalance() {
        return deposit;
    }
}
class BankB extends Bank{
    int deposit;
    public int getBalance() {
        return deposit;
    }
}class BankC extends Bank{
    int deposit;
    public int getBalance() {
        return deposit;
    }
}

