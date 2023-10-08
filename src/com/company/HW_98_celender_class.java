package com.company;

import java.util.Calendar;

public class HW_98_celender_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getFirstDayOfWeek());
    }
}
