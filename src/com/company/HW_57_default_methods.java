package com.company;

interface MyCamera{
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
interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
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
public class HW_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone aa =new MySmartPhone();
        aa.record4KVideo();
       // aa.greet(); ---error
        String[] ar = aa.getNetwork();
        for (String item:ar) {
            System.out.println(item);
        }
    }
}
