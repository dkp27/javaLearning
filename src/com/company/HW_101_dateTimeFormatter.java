package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HW_101_dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // this is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-dd-yyyy"); // this is the format

        String myDate = dt.format(df); // creating date string using date and formatter
        System.out.println(myDate);


    }
}
