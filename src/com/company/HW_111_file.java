package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW_111_file {
    public static void main(String[] args) throws FileNotFoundException {

        // Code to create a new file
        /*
        File myfile = new File("HW111.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("HW111.txt");
            fileWriter.write("This is our first java course\nOkay now bye");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Reading a file
        File myFile = new File("HW111.txt");
        try {
        Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            throw new FileNotFoundException();
        }
         */
          // Deleting file
        File myFile = new File("HW111.txt");
        if (myFile.delete()){
            System.out.println("I have deleted:" +myFile.getName());
        }
        else {
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
