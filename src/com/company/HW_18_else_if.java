package com.company;
import java.util.Scanner;

public class HW_18_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy Your life!");
        }

        /*
          if (age>56){
            System.out.println("You are experienced!");
           }
          else if (age>46) {
              System.out.println("You are semi-experienced!");
          }
          else if (age>36) {
              System.out.println("You are semi-semi-experienced!");
          }
          else {
              System.out.println("You are not experienced!");
          }
         */


    }
}
