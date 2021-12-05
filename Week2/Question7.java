package com.rishabh.Week2;
/*
Write a Java program to print an American flag on the screen.
 */
public class Question7 {
    int tillstar,tillline;
    Question7(){
        tillstar = 7;
        tillline = 5;
    }

    void Display(){
        for (int i = 0; i < tillstar; i++) {
            if(i % 2 ==0){
                System.out.println("********** " + "====================");
            }else{
                System.out.println(" ********  " + "====================");
            }
        }
        for (int i = 0; i < tillline; i++) {
            System.out.println("===============================");
        }
    }

    public static void main(String[] args){
        Question7 q = new Question7();
        q.Display();
    }
}
