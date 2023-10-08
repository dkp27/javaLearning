package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class HW_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l1.add(6);
        l1.add(7);
        l1.add(5);
        l1.add(6);
        l1.add(4);
        l1.addLast(755);
        l1.addAll(0,l2);
//        l1.clear();
        l1.isEmpty();
//        l1.removeLast();
        System.out.println(l1.contains(6));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(2, 200);
        for (int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
