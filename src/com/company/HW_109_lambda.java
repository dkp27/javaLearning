package com.company;
interface DemoAno{
    void meth1();
//    void meth2();
}
//class Anonydemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public void meth1() {
//        System.out.println("I am meth 1");
//    }
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//    }
//}
public class HW_109_lambda {
    public static void main(String[] args) {
//        Anonydemo obj = new Anonydemo();
//        obj.meth1();
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                        System.out.println("I am meth 1");
//            }
//
//            @Override
//            public void meth2() {
//        System.out.println("I am meth 2");
//            }
//        };
//        obj.meth1();
//        obj.meth2();
        DemoAno obj = ()->{
          System.out.println("I am method 1 from this lambda");
        };
        obj.meth1();
    }
}
