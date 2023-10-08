package com.company;

class NegativeArraySizeException extends Exception{
    @Override
    public String toString() {
        return "Radius can not be negative 1";
    }

    @Override
    public String getMessage() {
        return "Radius can not be negative 2";
    }
}
public class HW_84_throw_throws {
    public static double Area(int r) throws NegativeArraySizeException {
        if (r<0){
            throw new NegativeArraySizeException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result  = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
//            int c = divide(7,0);
//            System.out.println(c);
            double ar = Area(8);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
