package com.company;
import java.util.Scanner;

public class HW_19_Ch4_Ps {
    public static void main(String[] args) {
//         problem 1
//        int a = 11;
//        if (a==11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }

       // problem 2
//        byte a, b, c;
//        System.out.println("Please Enter your marks:");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//         a = sc.nextByte();
//        System.out.println("Enter your marks in Chemistry");
//         b = sc.nextByte();
//        System.out.println("Enter your marks in Mathematics");
//         c = sc.nextByte();
//         float avg = (a + b + c)/3;
//        System.out.println("Your overall percentage:" + avg);
//         if (avg>=40 && a>33 && b>33 && c>33){
//             System.out.println("PASS");
//         }
//         else {
//             System.out.println("FAIL");
//         }

        // problem 3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter Your Income");
//        float tax = 0;
//        float income = sc.nextFloat();
//
//        if (income<=2.5f){
//            tax = tax + 0;
//        }
//        else if (income>2.5f && income<=5.0f) {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//            else if (income>5.0f && income<=10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//            else if (income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax paid by the employee is:" + tax);

//            q4

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        Q5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an year:");
        int year = sc.nextInt();
        if ((year/4 == 0) && (year%100 !=0) || (year%400 ==0) ){
            System.out.println("Specified year is a leap year");
        }
        else {
            System.out.println("Specified year is not a leap year");
        }


        //q6
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the URL:");
//        String website = sc.next();
//        if (website.endsWith(".com")){
//            System.out.println("This is an commercial website");
//        }
//        else if (website.endsWith(".org")){
//            System.out.println("This is an organization website");
//        }
//        else if (website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }

    }
}
