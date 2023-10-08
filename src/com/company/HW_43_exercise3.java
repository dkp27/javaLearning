package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    int number ;
    int inputNumber;
    int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.printf("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if (inputNumber>number) {
            System.out.println("You are entered greater number");
        }
        else if (inputNumber<number) {
            System.out.println("You are entered smaller number");
        }
        return false;
    }
}
public class HW_43_exercise3 {
    public static void main(String[] args) {
        Game a = new Game();
        boolean b = false;
        while (!b){
            a.takeUserInput();
            b =a.isCorrectNumber();
        }

    }
}
