package com.company;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;   // constructor method;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}
   class Ractangle{
        private int length;
        private int breadth;

       public Ractangle() {
           this.length = 4;
           this.breadth = 5;
       }

       public Ractangle(int length, int breadth) {
           this.length = length;
           this.breadth = breadth;
       }

       public int getLength() {
           return length;
       }
       public int getBreadth() {
           return breadth;
       }
   }
   class sphere{
    private int radius;

       public int getRadius() {
           return radius;
       }
       public void setRadius(int radius) {
           this.radius = radius;
       }
   }

public class HW_44_Ch4_Ps {
    public static void main(String[] args) {

        // Problem no. 1&3
/*
        Cylinder myCylinder = new Cylinder(9,12);
         //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
         //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // Problem no. 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        // Problem no. 4
        Ractangle rec = new Ractangle();
        System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());
 */
        // Problem no. 5
        sphere sp = new sphere();
        sp.setRadius(100);
        System.out.println(sp.getRadius());
    }
}
