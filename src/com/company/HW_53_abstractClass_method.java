package com.company;

 abstract class parent2 {
     public parent2() {
         System.out.println("Mai base2 ka constructor hoon ");
     }

     public void sayHello() {
         System.out.println("Hello");
     }

     abstract public void greet();

     abstract public void greet2();
 }

 class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
     @Override
     public void greet2(){
         System.out.println("Good afternoon");
     }
}
 abstract class child3 extends parent2{
    @Override

    public void greet2(){
        System.out.println("I am good");
    }
}
public class HW_53_abstractClass_method {
    public static void main(String[] args) {
        child2 a = new child2();
        //  child3 b = new child3();    its not possible
       // parent2 v = new parent2(); its not possible
    }
}
