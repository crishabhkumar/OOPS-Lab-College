/*
1.Consider a scenario, Bank is a class that provides
functionality to get rate of interest.
But, rate of interest varies according to banks.
For example, SBI, ICICI and AXIS banks could
provide 8%, 7% and 9% rate of interest.
 */
package com.rishabh.Week6;

public class CommonBank {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a =new AXIS();
        System.out.println("Rate of interest in SBI:" + s.rateOfInt());
        System.out.println("Rate of interest in ICICI:" + i.rateOfInt());
        System.out.println("Rate of interest in AXIS:" + a.rateOfInt());
    }
    public int rateOfInt(){
        return 3;
    }
}

class SBI extends CommonBank{
    public int rateOfInt(){
        return 8;
    }
}

class ICICI extends CommonBank{
    public int rateOfInt(){
        return 7;
    }
}
class AXIS extends CommonBank{
    public int rateOfInt(){
        return 9;
    }
}

