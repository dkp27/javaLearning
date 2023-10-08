package com.company;

class myNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while (true){
            System.out.println("Thank you 1 !");
            i++;
            try {
                Thread.sleep(455);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class myNewThr2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Thank you 2 !");
        }
    }
}
public class HW_75_thread_method {
    public static void main(String[] args) {
        myNewThr1 t1 = new myNewThr1();
        myNewThr2 t2 = new myNewThr2();
        t1.start();
//        try {
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
