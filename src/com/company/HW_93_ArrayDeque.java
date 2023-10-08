package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class HW_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);
        ad1.add(55);
        ad1.add(9);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
