package com.company;

import java.sql.SQLOutput;

class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public String getName() {return name;}
    public void setName(String n) {name = n;}
    public void setId(int i) {id = i;}
    public int getId() {return id;}
}
public interface HW_42_constructors{
    public static void main(String[] args) {

        MyMainEmployee harry = new MyMainEmployee("Priyal" ,44);
        //harry.setId(34);
        // harry.setName("HARRY");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}

