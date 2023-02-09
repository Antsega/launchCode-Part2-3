package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println("Student 1's Score " + CheckFileExtension("Program.java"));
        System.out.println("Student 2's Score " + CheckFileExtension(""));
        System.out.println("Student 3's Score " + CheckFileExtension("MyCode.java"));
        System.out.println("Student 4's Score " + CheckFileExtension("CoolProgram.java"));

        // Test Divide
    //     Scanner input1 = new Scanner(System.in);
    //     Scanner input2 = new Scanner(System.in);
    //     System.out.println("Enter two numbers to divide");
    //     Integer answer1 = input1.nextInt();
    //     Integer answer2 = input2.nextInt();
    //     System.out.println("Results: " + Divide(answer1, answer2));
    // }
    }

    public static int Divide(int x, int y)
    {
        int z = x / y;
        if (y == 0) {
            try {
                throw new DivideException("Cannot divide by zero");
            } catch (DivideException e) {
                e.printStackTrace();
            }
        }
        return z;
    }

    


    public static int CheckFileExtension(String fileName)
    {   
        Integer score = 0;
        String ext = ".java";
        String eval = "";

        // if null or empty str, throw error and -1 point
        if (fileName.equals("") || fileName.getClass().equals(null)) {
            try {
                throw new DivideException("Cannot submit empty or null file");
            } catch (DivideException e) {
                e.printStackTrace();
            }
            score = -1;
        } 
        else {
        // if fileName ends with .java; score ++
        for (int i = (fileName.length() - 5); i <= fileName.length() - 1; i++) {
            eval += fileName.charAt(i);
        }
        if (eval.equals(ext)) {
            score++;
        }
        // if doesn't end in .java = 0 
        else score = 0;
    }
        return score;
    }

}


