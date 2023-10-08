package com.company;

class myThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("Thread 1 is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("Thread 2 is running");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class HW_70_thread {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
