package com.company;

public class HW_35_ps {
    static void table(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n", n, i , n*i);
        }
    }
    static void pattern1(int a){
        for (int i=0; i<a; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sum (int n){
        if (n==1){
            return 1;
        }
        return n + sum(n-1);
    }

    static void pattern2(int a){
        for (int i=a-1; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fibo(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }

    static int avg (int ...arr){
        int result =0;
        int n = arr.length;
        for (int a:arr){
            result += a;
        }
        return (result/n);
    }

    static void pattern1_rec(int n) { // problem no. 8
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Problem no. 1
        //  table(5);

        // Problem no. 2
        // pattern1(6);

        // Problem no. 3
        // int a = sum(5);
        // System.out.println(a);

        // Problem no. 4
        //  pattern2(5);

        // Problem no. 5
        // (Fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .)
        // int a = fibo(5);
        // System.out.println(a);

        // Problem no. 6
        // System.out.println(avg(1,2,3));
        // System.out.println(avg(1,2,3,4,5,6,7));

        // Problem no. 8
        pattern1_rec(5);
    }
}
