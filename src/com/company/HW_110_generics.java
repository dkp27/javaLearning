package com.company;

import java.util.ArrayList;

class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class HW_110_generics {
    public static void main(String[] args) {
        ArrayList <Integer>arrayList = new ArrayList();
//        arrayList.add("str1");
        arrayList.add(12);
        arrayList.add(122);
//        int a =arrayList.get(2);
//        System.out.println(a);
        MyGeneric <String,Integer>g1 = new MyGeneric(12,"step",10);
        String str1 = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str1 + int1);
    }
}
