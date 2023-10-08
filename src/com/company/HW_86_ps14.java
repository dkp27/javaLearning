package com.company;

import java.util.Scanner;

public class HW_86_ps14 {
    public static void main(String[] args) {

        // Problem no. 1
        /*
        int a = 7 --> syntax error
        int age = 78;
        int year_born = 2000-78; --> logical error
        System.out.println(8/0);
         */

        // Problem no. 2
        /*
        try {
            int b = 67/0;
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
         */

        // Problem no. 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int index;
        while (flag && i<5){
            try {
                System.out.println("Enter the value of index ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invailid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
