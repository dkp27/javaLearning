package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class mySampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("meth2");
    }
    public void meth3() {
        System.out.println("meth3");
    }
    public void meth4() {
        System.out.println("meth4");
    }
}
public class HW_58_inheritance_interfaces {
    public static void main(String[] args) {
        mySampleClass sam = new mySampleClass();
        sam.meth1();
        sam.meth2();
        sam.meth3();
        sam.meth4();
    }
}
