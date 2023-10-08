package com.company;

class myTreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while (i<20){
            System.out.println("I am a thread 1 not a threat");
            i++;
        }
    }
}
class myTreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i<20){
        System.out.println("I am a thread 2 not a threat");
            i++;
        }
    }
}

public class HW_71_runnable {
    public static void main(String[] args) {
        myTreadRunnable1 bullet1 = new myTreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        myTreadRunnable2 bullet2 = new myTreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
