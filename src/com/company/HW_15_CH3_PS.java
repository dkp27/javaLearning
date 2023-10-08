package com.company;

import java.util.Locale;

public class HW_15_CH3_PS {
    public static void main(String[] args) {

        // Problem 1
        // String str = "Priyal";
        // str = str.toLowerCase();
        // System.out.println(str);

        // Problem 2
//        String name = "To upper case";
//        name = name.replace(" ", "_");
//        System.out.println(name);

        // Problem 3
         //   String letter = "Dear <|name|> , Thanks a lot!";
          //  letter = letter.replace("<|name|>", "Priyal");
       // System.out.println(letter);

        // Problem 4
        String star = "This string contains double and triple spaces";
        System.out.println(star.indexOf("  "));
        System.out.println(star.indexOf("   "));

        // Problem 5
        String myletter = "Dear Harry,\n\t\t This Java Course is Nice.\n\t\t Thanks!";
        System.out.println(myletter);
    }
}
