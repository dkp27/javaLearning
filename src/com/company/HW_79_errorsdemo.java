package com.company;

import java.util.Scanner;

public class HW_79_errorsdemo {
    public static void main(String[] args) {
        // syntax error
        // int a = 0 ---> Error : no semicolon!
        // b = 9 ---> Error : b is not declared!

        // logical error method
        // write the program to print all prime numbers between 1 to 18.
        System.out.println(2);
        for (int i=1; i<9;i++)
            System.out.println(2*i+1);

        // runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is :" + 1000/k);
    }
}
