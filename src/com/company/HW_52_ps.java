package com.company;
/*
   // For question number 1 & 3
class Circle1{
    public int radius;
    Circle1(){
        System.out.println("I am non param of circle");
    }
    Circle1(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
*/

class Rectangle1{
    public int length;
    public int width;
    public int height;

    Rectangle1(){
        System.out.println("I am Rectangle");
    }
    Rectangle1(int l, int w, int h){
        System.out.println("I am Rectangle1 parameterized constructor");
        this.length = l;
        this.width = w;
        this.height= h;
    }
    public double area(){
        return this.length*this.width;
    }
    public double volume(){
        return this.length*this.width*this.height;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
class cuboid extends Rectangle1{
    public int breadth;

    cuboid(int l, int b, int h){
        super(l,b,h);
        System.out.println("I am cuboid parameterized constructor");
        this.breadth = b;
    }
    public cuboid() {
        System.out.println("I am cuboid");
    }
    public double area(){
        return 2*(this.length * this.breadth + this.breadth * this.height + this.length * this.height);
    }
    public double volume(){
        return this.length*this.breadth*this.height;
    }

    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class HW_52_ps {
    public static void main(String[] args) {
        // Problem 1
        /*
         Circle1 objC = new Circle1(12);
         Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println(objC.area());
        System.out.println(obj.volume());
         */

        //Problem 2 & 4
        Rectangle1 obj = new Rectangle1();
        cuboid sb = new cuboid();
//        System.out.println(obj.area());
//        System.out.println(sb.area());
        sb.setBreadth(4);
        sb.setHeight(5);
        sb.setLength(6);
        obj.setLength(9);
        System.out.println(sb.getBreadth());
        System.out.println(sb.getHeight());
        System.out.println(sb.getLength());
        System.out.println(obj.getLength());
    }
}
