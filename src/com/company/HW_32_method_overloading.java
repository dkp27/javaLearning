package com.company;

public class HW_32_method_overloading {

    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr [0] =98;
    }
    static void telljoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }
    public static void main(String[] args) {
//        telljoke();
        // case 1 : changing the integer
        // int [] marks = {52,65,78,86,95};
        // int x= 45;
        // change (x);
        // System.out.println("The value of x after running change is:" + x);

        // case 2 : changing the array
        // int [] marks = {52,65,78,86,95};
        // change2 (marks);
        // System.out.println("The value of x after running change is:" + marks[0]);

         // Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);

    }
}
