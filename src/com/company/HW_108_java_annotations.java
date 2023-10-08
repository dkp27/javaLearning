package com.company;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
}
class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class HW_108_java_annotations {
@SuppressWarnings("Deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(4,6);
    }
}
