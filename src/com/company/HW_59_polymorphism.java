package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording 4k video...");
    }
}
interface MyWifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of network");
        String[] networkList ={"Harry", "Prashant", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting" + network);
    }
//    public void record4KVideo(){
//        System.out.println("Take snap and Recording 4k video...");
//    }
}

public class HW_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone2(); // this is a smartphone but , use it as a camera
        // cam.getNetwork(); -- not allowed
        cam.record4KVideo();
        MySmartPhone2 c = new MySmartPhone2();
        c.recordVideo();
        c.getNetwork();
        c.callNumber(1234);
    }
}
