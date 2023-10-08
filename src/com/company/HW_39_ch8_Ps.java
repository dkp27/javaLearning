package com.company;

 class employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void  setName(String n){
         name =n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle{
     int wid;
     int len;
     public int area(){
         return wid*len;
     }
     public int perimeter(){
         return 2*(wid+len);
     }
}

class Tommy{
     public void hit(){
         System.out.println("Hitting the enemy");
     }
     public void run(){
         System.out.println("Running from the enemy");
     }
     public void fire(){
         System.out.println("Firing on  the enemy");
     }
}
class circle {
     float red;
     public float area(){
         return (3.14f*(red*red));
     }
}
public class HW_39_ch8_Ps {
    public static void main(String[] args) {
        // Problem 1
//        employee1 harry = new employee1();
//         harry.setName("Harry");
//         harry.salary = 34;
//        System.out.println(harry.getName());
//        System.out.println(harry.salary);

        // Problem 2
//        CellPhone asus = new CellPhone();
//        asus.callFriend();
//        asus.vibrate();
//        asus.ring();

        // Problem 3
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        // Problem 4
//        rectangle rec = new rectangle();
//        rec.wid = 4;
//        rec.len = 5;
//        System.out.println(rec.area());
//        System.out.println(rec.perimeter());

        // Problem 5
//        Tommy play1 = new Tommy();
//        play1.fire();
//        play1.run();
//        play1.hit();

        // Problem 6
        circle cr = new circle();
        cr.red = 6;
        System.out.println(cr.area());
    }
}
