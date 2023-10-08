package com.company;
import javax.swing.text.Style;
import java.util.Scanner;

public class HW_16_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Yes boy you can drive!");
        }
        else {
            System.out.println("No boy you cannot drive yet!");
        }
    }
}
