package com.company;

public class HW_33_varargs {
//    static int sum (int a ,int b){
//        return a+b;
//    }static int sum (int a ,int b,int c){
//        return a+b+c;
//    }static int sum (int a ,int b,int c, int d){
//        return a+b+c+d;
//    }
    static int sum (int ...arr){  // if x is comp. then add (int x)
        // static int sum (int x ,int ...arr) like this
        // Available as int [] arr;
        int result =0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of  4 and 5 is: " + sum (4,5));
        System.out.println("The sum of 3, 4 and 5 is: " + sum (3 ,4,5));
        System.out.println("The sum of 2, 3, 4 and 5 is: " + sum (2,3,4,5));
    }
}
