package com.company;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
      return "Can not add 8 and 9";
    }
    @Override
    public String getMessage() {
        return " I am getMassage()";
    }
}
class CanNotDivideZeroException extends Exception{
    @Override
    public String toString(){
      return "Can not divide by zero";
    }
    @Override
    public String getMessage() {
        return " I am getMassage()";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
      return "Input cant be greater than 100000";
    }
    @Override
    public String getMessage() {
        return " I am getMassage()";
    }
}
class MaxMultiplyInputException extends Exception{
    @Override
    public String toString(){
      return "Input cant be greater than 7000 while multiplying";
    }
    @Override
    public String getMessage() {
        return " I am getMassage()";
    }
}

class CustomCalculator {
    double add(double a , double b) throws InvalidInputException ,MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (a==8 || b==9){
            throw new InvalidInputException();
        }
        return a + b;
    }
    double sub(double a , double b) throws MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a - b;
    }
    double multi(double a , double b) throws MaxInputException ,MaxMultiplyInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }
    double div(double a , double b) throws CanNotDivideZeroException ,MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (b==0){
            throw new CanNotDivideZeroException();
        }
        return a / b;
    }
}
public class HW_103_custom_clacPS {
    public static void main(String[] args) throws InvalidInputException, CanNotDivideZeroException,MaxInputException,MaxMultiplyInputException{
        CustomCalculator c = new CustomCalculator();
//        c.add(8,9);
//        c.div(7,0);
//        c.multi(400000,40);
        
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
    }
}
