package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

interface  myMeth{
    void meth3();
}
public class HW_112_ps {
    public static void main(String[] args) {
//        myMeth c = new myMeth() {
//            @Override
//            public void meth3() {
//                System.out.println("I am method ");
//            }
//        };
//        c.meth3();

        int i = 5;
        int a = 21;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        for (int j = 0; j < 10; j++) {
            table += a + "X"+(j+1) + "=" + a*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
