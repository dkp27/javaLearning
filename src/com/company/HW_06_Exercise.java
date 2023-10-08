package com.company;
import jdk.jfr.Percentage;

import java.util.Scanner;

public class HW_06_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of five subjects:");
        System.out.println("Enter the marks of subject eng: ");
        int eng = sc.nextInt();
        System.out.println("Enter the marks of subject phy:");
        int phy = sc.nextInt();
        System.out.println("Enter the marks of subject chem:");
        int chem = sc.nextInt();
        System.out.println("Enter the marks of subject math:");
        int math = sc.nextInt();
        System.out.println("Enter the marks of subject comp:");
        int comp = sc.nextInt();
        int sum = eng + phy + chem + math + comp;
        int Percentage = (sum/5);
        System.out.println(" Percentage " + " = " + Percentage);

    }
}
