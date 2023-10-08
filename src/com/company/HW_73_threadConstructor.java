package com.company;

class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        int i = 10;
        System.out.println("Thank you");
//        while (i<10){
//            System.out.println("I am a thread");
//        }
    }
        }
public class HW_73_threadConstructor {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Sohan");
        MyThread t2 = new MyThread("Rohan");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is: " + t1.getId());
        System.out.println("The id of the thread t is: " + t1.getName());
        System.out.println("The id of the thread t is: " + t2.getId());
        System.out.println("The id of the thread t is: " + t2.getName());
    }
}
