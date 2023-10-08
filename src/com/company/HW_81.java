package com.company;

import java.util.Scanner;

public class HW_81{
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 72;
        marks[1] = 84;
        marks[2] = 90;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is:" + marks[ind]);
            System.out.println("The value of array-value/number is:" + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occured!");
            System.out.println(e);
        }
    }
}
