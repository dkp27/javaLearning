package com.company;

interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}
public class HW_54_interfaces {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();
//        a.applyBrake(2);
//        a.blowHornK3g();
        a.blowHorn();
    }
}
