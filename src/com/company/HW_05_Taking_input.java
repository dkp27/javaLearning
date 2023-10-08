package com.company;
import java.util.Scanner;


public class HW_05_Taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input ");
        Scanner str = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = str.nextInt();
//        System.out.println("Enter number 2");
//        int b = str.nextInt();
//        int sum = a + b;
//        System.out.println("The sum of these numbers is ");
//        System.out.println(sum);
//        boolean b1 = str.hasNextInt();
//        System.out.println(b1);
//        String st = str.next();
        String st = str.nextLine();
        System.out.println(st);
    }
}
