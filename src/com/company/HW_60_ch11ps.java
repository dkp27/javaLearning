package com.company;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    @Override
     void write(){
        System.out.println("Write");
    }
     void refill(){
        System.out.println("Refill");
    }
    void changeNib (){
        System.out.println("change Nib");
    }
}

class Monkey{
    void jump (){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements basicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    void speak(){
        System.out.println("Hello sir!");
    }
}


 class Telephone{
    void ring (){
        System.out.println("Ringing...");
    }
    void lift (){
        System.out.println("Lifting...");
    }
    void disconnect (){
        System.out.println("Disconnect...");
    }
}
abstract class smartTelephone {
    abstract void call();
    abstract void map();
}
class newTelephone extends Telephone{
    void call(){
        System.out.println("Calling...");
    }
    void map(){
        System.out.println("Mapping...");
    }
}

interface tvRemote{
    void volumeUp();
    void volumeDown();
}
interface smartTvRemote extends tvRemote{
    void netflix();
    void primeVideo();
    void youtube();
}
interface Tv{
    void on();
    void off();
}
class Remote implements smartTvRemote,Tv{
   public void on(){
       System.out.println("On");
   }
   public void off(){
       System.out.println("Off");
   }
    public void volumeUp(){
        System.out.println("volumeUp");
    }
    public void volumeDown(){
        System.out.println("volumeDown");
    }
    public void netflix(){
        System.out.println("netflix");
    }
    public void primeVideo(){
        System.out.println("primeVideo");
    }
    public void youtube(){
        System.out.println("youtube");
    }
}
    public class HW_60_ch11ps {
        public static void main(String[] args) {
        // Question 1&2
/*
        FountainPen pen = new FountainPen();
       pen.changeNib();
       pen.refill();
       pen.write();

        // Question 3
        Human hm = new Human();
        hm.eat();
        hm.bite();
        hm.jump();
        hm.sleep();
        hm.speak();


        // Question 4
        newTelephone m = new newTelephone();
        Telephone n = new newTelephone();
        n.disconnect();
        n.lift();
        n.ring();
        m.ring();
        m.call();
        m.map();

        // Question 5 refer q3
        Monkey monk = new Human();
        monk.bite();
       // monk.eat(); --error
 */
        // Question 6&7
        Remote a = new Remote();
        Tv b = new Remote();
        tvRemote c = new Remote();

    }
}
