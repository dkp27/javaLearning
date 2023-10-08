package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HW_102_ps_adjavaCH1 {
    public static void main(String[] args) {

        // problem no. 1
        ArrayList<String>ar = new ArrayList<>();
        ar.add("Somesh");
        ar.add("Aman");
        ar.add("Ajeet");
        ar.add("Subham");
        ar.add("Saurabh");
        ar.add("Ranjeet");
        ar.add("Madhav");
        ar.add("Ankit");
        ar.add("Amar");
        ar.add("Priyal");
        for (Object o:ar) {
            System.out.println(o);
        }

        // problem no. 2
        Date d = new Date();
        System.out.println(d.getHours()+ ":" + d.getMinutes() + ":" + d.getSeconds());

        // problem no. 3
        Calendar C = Calendar.getInstance();
        System.out.println(C.get(Calendar.HOUR_OF_DAY)+ ":" + C.get(Calendar.MINUTE) + ":" + C.get(Calendar.SECOND));

        // problem no. 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s a");
        String myTime =dt.format(df);
        System.out.println(myTime);

        // problem no. 5
        /*
       HashSet<Integer> s = new HashSet<Integer>();
        s.add(4);
        s.add(4);
        s.add(4);
        System.out.println(s);

         */
    }
}
