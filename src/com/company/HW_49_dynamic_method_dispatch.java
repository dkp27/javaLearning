package com.company;

class Phone {
    public void showTime(){
        System.out.println("showing time...");
    }
    public void on (){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on (){
        System.out.println("Turning on SmartPhone...");
    }
}
public class HW_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();
        Phone obj = new SmartPhone();
        obj.showTime();
        obj.on();
        SmartPhone obj1 = new SmartPhone();
        obj1.music();
    }
}
