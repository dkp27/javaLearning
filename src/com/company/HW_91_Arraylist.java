package com.company;

import java.util.*;

public class HW_91_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l1.add(6);
        l1.add(7);
        l1.add(5);
        l1.add(6);
        l1.add(4);
//        l1.add(0,1);
        l1.addAll(0,l2);
//        l1.clear();
        l1.isEmpty();
        System.out.println(l1.contains(6));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(2, 200);
        for (int i=0; i<l1.size(); i++){
        System.out.print(l1.get(i));
        System.out.print(", ");
        }
    }
}
