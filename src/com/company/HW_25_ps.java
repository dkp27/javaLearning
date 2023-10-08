package com.company;
import java.util.Scanner;

public class HW_25_ps {
    public static void main(String[] args) {

        // Problem 1
//    int n = 5;
//    for (int i=n; i>0; i--){
//        for (int j=0; j<i; j++){
//            System.out.print("*");
//        }
//        System.out.print("\n");
//    }

        // Problem 2
//        int sum = 0;
//        int i = 0;
//     while (i<5){
//         System.out.println(2*i);
//         sum = sum + (2*i);
//         i++;
//     }
//        System.out.print("Sum of the even number is:");
//        System.out.println(sum);

        // Problem 3
//        int n = 5;
//        for (int i=1; i<=10; i++){
//            System.out.printf("%d X %d = %d\n",n,i,n*i );
//        }
        // Problem 4
//        int n = 10;
//        for (int i=10; i>0; i--){
//        System.out.printf("%d X %d = %d\n",n,i,n*i );
//        }

        // Problem 5
//        int num = 1;
//        int n = 5;
//        for (int i=1; i<=n; i++){
//            num = num*i;
//        }
//        System.out.println("Factorial of " + n + " is " + num);

        // Problem 6
//        int n = 5;
//        int i = 1;
//        int factorial = 1;
//     while (i<=n) {
//         factorial *= i;
//         i++;
//     }
//         System.out.println(factorial);

        // Problem 9
        int n = 8;
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}
