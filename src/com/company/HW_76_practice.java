package com.company;
class T1 extends Thread{
    public void run(){
        while (true){
        System.out.println("Good Morning");
        }
    }
}
class T2 extends Thread{
    public void run(){
//        while (true){
//            try {      // for Q2
//                Thread.sleep(200);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}
public class HW_76_practice {
    public static void main(String[] args) {
        // Problem 1&2
        T1 t1 = new T1();
        T2 t2 = new T2();
//        t1.start();
//        t2.start();

        // Problem 3
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // Problem 4
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
